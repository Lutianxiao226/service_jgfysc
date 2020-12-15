package com.neusoft.hz.service;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.hz.comp.hsbservice.common.model.ReturnMessageBean;
import com.neusoft.hz.comp.hsbservice.common.model.ServiceContenBean;
import com.neusoft.hz.comp.hsbservice.common.service.deal.ConditionDeal;
import com.neusoft.hz.mapper.BloodDonationMapper;
import com.neusoft.hz.model.BloodDonation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RecordConditionData implements ConditionDeal {

	@Autowired
	private BloodDonationMapper bloodDonationMapper;

	private static final Logger log = LogManager.getLogger(RecordConditionData.class);

	@Override
	public void deal(ServiceContenBean serviceContenBean) {
		// TODO Auto-generated method stub
		ReturnMessageBean retrunMessageBean = serviceContenBean.getReturnMessageBean();
		Map<String, String> condtion = serviceContenBean.getConditionMap();
		String servicecode = serviceContenBean.getServiceCode();
		if("".equals(servicecode)||null==servicecode){
			retrunMessageBean.setRetcode("-1");
			retrunMessageBean.setRettext("servicecode为空！");
		}

		switch (servicecode) {
			case "20011131":
				JSONObject res = JSONObject.parseObject("{}");
				List<BloodDonation> list = new ArrayList<BloodDonation>();
				BloodDonation bloodDonation = new BloodDonation();
				Map<String,String> map = serviceContenBean.getConditionMap();
				bloodDonation.setBusinessdate(map.get("StartDate"));
				try {
					list  = bloodDonationMapper.select(bloodDonation);
					retrunMessageBean.setReturnQueryList(list,"0");
				}catch (Exception e){
					retrunMessageBean.setRetcode("-1");
					retrunMessageBean.setRettext(e.getMessage());
				}

			default:break;
		}

	}
}
