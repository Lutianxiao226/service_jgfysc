package com.neusoft.hz.entrance.impl;

import javax.jws.WebService;

import com.neusoft.hz.comp.hsbservice.common.model.ReturnMessageBean;
import com.neusoft.hz.comp.hsbservice.common.model.ServiceContenBean;
import com.neusoft.hz.comp.hsbservice.common.schema.ValidataXML;
import com.neusoft.hz.comp.hsbservice.common.service.XmlSaxReader;
import org.springframework.beans.factory.annotation.Autowired;


import com.neusoft.hz.entrance.Service;

@WebService(targetNamespace  = "http://hz.neusoft.com", serviceName = "ServiceImpl", endpointInterface = "com.neusoft.hz.entrance.Service")
public class ServiceImpl implements Service {

	@Autowired
	private XmlSaxReader xmlSaxReader;

	@Autowired
	private ValidataXML validataXML;

	@Override
	public String resourceMethod(String xmlData) {
		ReturnMessageBean returnMessageBean = new ReturnMessageBean();
		try {
			ServiceContenBean serviceContenBean = new ServiceContenBean();

			serviceContenBean.setReturnMessageBean(returnMessageBean);
			serviceContenBean.setXml(xmlData);
			if ("1".equals(serviceContenBean.getHeartBeat())){
				//logger.info("心跳服务检测");
				return returnMessageBean.parseDocument();
			}
			xmlSaxReader.deal(serviceContenBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMessageBean.parseDocument();
	}
}
