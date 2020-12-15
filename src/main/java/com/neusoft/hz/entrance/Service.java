package com.neusoft.hz.entrance;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://hz.neusoft.com")
public interface Service {
	@WebMethod(operationName = "resourceMethod")
	@WebResult(name = "xmlData")
	public String resourceMethod(@WebParam(name = "xmlData") String xmlData) throws Exception;


}
