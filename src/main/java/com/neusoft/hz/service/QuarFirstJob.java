package com.neusoft.hz.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.neusoft.hz.mapper.BloodDonationMapper;
import com.neusoft.hz.model.BloodDonation;
import com.neusoft.hz.util.BloodClient;
import com.neusoft.hz.util.PropertiesUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class QuarFirstJob {

	private static final Logger log = LogManager.getLogger(QuarFirstJob.class);
	@Autowired
	private BloodDonationMapper bloodDonationMapper;

	public void startJob() {
		JSONObject res = JSONObject.parseObject("{}");
		//List<BloodDonation> list = new ArrayList<BloodDonation>();
		HashMap map = new HashMap();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		 String startDate = df.format(calendar.getTime());
		map.put("StartDate",startDate);

		log.info("开始获取"+startDate+"的数据");
		String response = BloodClient.getData(map, PropertiesUtil.prop.getProperty("getBloodDonationURL"));
		res = JSONObject.parseObject(response, Feature.OrderedField);
		if (res.containsKey("code")) {
			// code=00代表成功
			if("200".equals(res.getString("code"))){
				JSONObject jsonObject=JSONObject.parseObject(res.getString("value"));
				BloodDonation bloodDonation = JSONObject.toJavaObject(jsonObject, BloodDonation.class);
				bloodDonation.setBusinessdate(startDate);
				bloodDonation.setAdd_date(new Date());
				Example example = new Example(BloodDonation.class);
				example.createCriteria().andEqualTo("businessdate", bloodDonation.getBusinessdate());
				int num = bloodDonationMapper.selectCountByExample(example);
				if(num<=0){
					bloodDonationMapper.insert(bloodDonation);
				}else{
					bloodDonationMapper.updateByExample(bloodDonation,example);
				}

			}
		}

	}
}
