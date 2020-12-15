package com.neusoft.hz.service;

import com.neusoft.hz.comp.hsbservice.common.model.ReturnMessageBean;
import com.neusoft.hz.comp.hsbservice.common.model.ServiceContenBean;
import com.neusoft.hz.comp.hsbservice.common.service.deal.BusinessDataDeal;
import com.neusoft.hz.comp.hsbservice.common.util.DateUtil;
import com.neusoft.hz.mapper.ComExternalInvokeLogMapper;
import com.neusoft.hz.mapper.WacUploadInfoMapper;
import com.neusoft.hz.model.ComExternalInvokeLog;
import com.neusoft.hz.model.HeaderContextBean;
import com.neusoft.hz.model.ResultBean;
import com.neusoft.hz.model.WacUploadInfo;
import com.neusoft.hz.util.Base64Util;
import com.neusoft.hz.util.UUIDUtils;
import com.neusoft.hz.webservice.IRouterService;
import com.neusoft.hz.webservice.RouterService;
import com.neusoft.hz.webservice.RunService;
import com.thoughtworks.xstream.XStream;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Holder;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class RecordBusinessData implements BusinessDataDeal {

	@Autowired
	private WacUploadInfoMapper wacUploadInfoMapper;

	@Autowired
	private ComExternalInvokeLogMapper comExternalInvokeLogMapper;

	private static final Logger log = LogManager.getLogger(RecordBusinessData.class);

	@SneakyThrows
	@Override
	public void deal(ServiceContenBean serviceContenBean) {

		// 记录日志(入参)
		String servicecode=serviceContenBean.getServiceCode();
        String sourceorgan = serviceContenBean.getSourceorgan();
        String sourcedomain = serviceContenBean.getSourcedomain();
		String cityinsertshow = serviceContenBean.getXml();
        String uuid = UUIDUtils.getUUID();

		// 取本地配置文件，ftp为属性文件名，放在包src.main.resources下，如果是放在src下，直接用ftp即可
		ResourceBundle resource = ResourceBundle.getBundle("ftp", new Locale("zh", "CN"));
		String clientIp = resource.getString("ftp.clientip");
		String clientMac = resource.getString("ftp.clientmac");
		String userId = resource.getString("ftp.userid");
		String pwd = resource.getString("ftp.pwd_spt");
		String OrganizationId = resource.getString("ftp.OrganizationId");

		List<Map<String, Object>> dataMaplist = serviceContenBean.getDatasetList();
		ReturnMessageBean returnMessageBean = serviceContenBean.getReturnMessageBean();
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddHHmmss");
		String format = date.format(new Date(System.currentTimeMillis()));
		StringBuffer errMsg = new StringBuffer();
		String retcode="1";

		switch (servicecode) {
			case "20016001": // 妇幼数据上传服务
				for(Map<String, Object> map:dataMaplist){
					List<Element> detailslist = (List<Element>) map.get("setdetails");
					Map<String, String> dataMap = new HashMap<String, String>();
					// 插入日志表中
					ComExternalInvokeLog comExternalInvokeLog = new ComExternalInvokeLog();
					comExternalInvokeLog.setRECORD_ID(uuid);// 记录id主键
                    comExternalInvokeLog.setSOURCEORGAN(sourceorgan);// 机构编码
                    comExternalInvokeLog.setSOURCEDOMAIN(sourcedomain);// 系统编码
                    comExternalInvokeLog.setCITY_INSERT_SHOW(cityinsertshow);// 市平台入参
                    comExternalInvokeLog.setCREATE_TIME(format);//创建时间
                    comExternalInvokeLog.setSERVICECODE(servicecode);//服务编码
					log.info("插入日志表开始");
					comExternalInvokeLogMapper.insertSelective(comExternalInvokeLog);
					log.info("插入日志表结束");
					List<ResultBean> list = new ArrayList<ResultBean>();
					List<String> magList = new ArrayList<String>();
					List<String> provinceInsert = new ArrayList<String>();
					for(int i = 0;i < detailslist.size();i++) {
						dataMap = (Map<String, String>) detailslist.get(i);
						WacUploadInfo wacUploadInfo = new WacUploadInfo();
						for (Field field : WacUploadInfo.class.getDeclaredFields()) {
							if (dataMap.containsKey(field.getName())) {
								try {
									PropertyDescriptor descriptor = new PropertyDescriptor(field.getName(), WacUploadInfo.class);
									Method method = descriptor.getWriteMethod();
									method.invoke(wacUploadInfo, dataMap.get(field.getName()));
								} catch (IllegalAccessException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IntrospectionException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalArgumentException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (InvocationTargetException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						try {
							// 插入妇幼业务表
							wacUploadInfo.setSERIALNUM_ID(UUIDUtils.getUUID());// 市平台主键
							wacUploadInfo.setRECORD_ID(uuid);// 记录id
							wacUploadInfo.setSOURCEORGAN(sourceorgan); // 机构编码
							wacUploadInfo.setSOURCEDOMAIN(sourcedomain);// 系统编码
							String base64 = wacUploadInfo.getBase64();
							String decryption = Base64Util.decryption(base64);
							wacUploadInfo.setPARSE_XML(decryption);//解析后的xml
							wacUploadInfo.setCREATE_TIME(format);//创建时间
							log.info("插入妇幼业务表开始");
							int i1 = wacUploadInfoMapper.insertSelective(wacUploadInfo);
							if (i1 == 1) {
								comExternalInvokeLog.setPROGRESS_STATUS_NAME("上报市平台成功");
								comExternalInvokeLog.setPROGRESS_STATUS_CODE("1");
								comExternalInvokeLogMapper.updateByPrimaryKeySelective(comExternalInvokeLog);
							} else {
								comExternalInvokeLog.setPROGRESS_STATUS_NAME("上报市平台失败");
								comExternalInvokeLog.setPROGRESS_STATUS_CODE("2");
								comExternalInvokeLogMapper.updateByPrimaryKeySelective(comExternalInvokeLog);
							}

							log.info("插入妇幼业务表结束");

							// 省入参 Header
							HeaderContextBean header = new HeaderContextBean();
							header.setSendSystemId("APP0001");// 发送数据的业务系统的系统编码，由数据中心平台指定。
							header.setOrganizationId(OrganizationId);// 发起交易的医疗机构代码，由平台统一分配
							header.setDocumentID(wacUploadInfo.getDocumentID());// 交易编号，同入参serviceType
							header.setUserId(userId);// 用户名
							header.setPwd(pwd);// 密码
							header.setRequestTime(DateUtil.getSysDate("yyyy-mm-dd hh:mm:ss"));// 请求时间，格式yyyy-mm-dd hh:mm:ss
							header.setClient_IP(clientIp);// 请求终端的IP地址，IPv4，格式如255.255.255.255
							header.setClient_Mac(clientMac);// 请求终端的MAC地址，大写，格式如00-FF-08-32-83-C1
							XStream xstream = new XStream();
							xstream.alias("Header", HeaderContextBean.class);
							String requestHeader = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" + xstream.toXML(header);
							requestHeader = requestHeader.replace("__", "_");

							// 省入参Body
							String xmlString = wacUploadInfo.getPARSE_XML();
							SAXReader saxReader = new SAXReader();
							Document document = saxReader.read(new StringReader(xmlString));
							Element root = document.getRootElement();
							root.setName("Body");
							String requestBody = document.asXML();

							String provinceInsertShow  = requestHeader + requestBody + "\n" + "----------------------------------------";
							provinceInsert.add(provinceInsertShow);

							// 调用省平台方法
							RouterService routerService = new RouterService();// 创建视图
							IRouterService iRouterService = routerService.getPort(IRouterService.class);// 获取服务实现类
							Holder outMsg = new Holder<String>();
							Holder<Integer> runServiceResult = new Holder<Integer>();
							log.info("调用省服务开始");

							iRouterService.runService(wacUploadInfo.getDocumentID(), requestHeader, requestBody, outMsg, runServiceResult);
							log.info("调用省服务结束");

                            magList.add(outMsg.value.toString() + "\n" + "----------------------------------------" + "\n");

							Document doc = null;
							String retDisp = null;

							// 下面的是通过解析xml字符串的
							doc = DocumentHelper.parseText(outMsg.value.toString()); // 将字符串转为XML

							Element rootElt = doc.getRootElement(); // 获取根节点
							Iterator iter = rootElt.elementIterator("Result"); // 获取根节点Body下的子节点Result
							// 遍历result节点
							while (iter.hasNext()) {
								Element recordEle = (Element) iter.next();

								String code = recordEle.elementTextTrim("Code"); // 取result节点下的子节点code值
								String msg = recordEle.elementTextTrim("Msg"); // 取result节点下的子节点msg值

								if (code.equals("0")) {
									retDisp = "上传成功";
									comExternalInvokeLog.setPROGRESS_STATUS_NAME("上报省平台成功");
									comExternalInvokeLog.setPROGRESS_STATUS_CODE("3");
									comExternalInvokeLogMapper.updateByPrimaryKeySelective(comExternalInvokeLog);
								} else {
									retDisp = "上传失败，原因如下：" + msg;
									comExternalInvokeLog.setPROGRESS_STATUS_NAME("上报省平台失败");
									comExternalInvokeLog.setPROGRESS_STATUS_CODE("4");
									comExternalInvokeLogMapper.updateByPrimaryKeySelective(comExternalInvokeLog);
								}
								ResultBean resultBean = new ResultBean();
								resultBean.setReturnMessage(retDisp);
								list.add(resultBean);
								log.info(retDisp + msg);
							}
						} catch (Exception e) {
							returnMessageBean.setRetcode("-1");
							returnMessageBean.setRettext(e.getMessage());
							errMsg.append("上报异常");
							log.error("上报异常," + e);
						}

					}
					returnMessageBean.setReturnQueryList(list, "0");

					StringBuffer stringBuffer = new StringBuffer();
					for (int i = 0;i < magList.size();i++) {
						stringBuffer.append(magList.get(i));
					}

					StringBuffer buffer = new StringBuffer();
					for (int i = 0;i < provinceInsert.size();i++) {
						buffer.append(provinceInsert.get(i));
					}

					comExternalInvokeLog.setPROVINCE_OUTPUT_SHOW(stringBuffer.toString());
					comExternalInvokeLog.setPROVINCE_INSERT_SHOW(buffer.toString());
					comExternalInvokeLog.setCITY_OUTPUT_SHOW(returnMessageBean.parseDocument());
					comExternalInvokeLogMapper.updateByPrimaryKeySelective(comExternalInvokeLog);
				}
				break;

			case "20016003": // 妇幼数据对账服务
				for(Map<String, Object> map:dataMaplist){
					List<Element> detailslist = (List<Element>) map.get("setdetails");
                    Map<String, String> dataMap = new HashMap<String, String>();

                    // 插入日志表中
					ComExternalInvokeLog comExternalInvokeLog = new ComExternalInvokeLog();
					comExternalInvokeLog.setRECORD_ID(uuid);// 记录id主键
					comExternalInvokeLog.setSOURCEORGAN(sourceorgan);// 机构编码
					comExternalInvokeLog.setSOURCEDOMAIN(sourcedomain);// 系统编码
					comExternalInvokeLog.setCITY_INSERT_SHOW(cityinsertshow);// 市平台入参
					comExternalInvokeLog.setCREATE_TIME(format);//创建时间
					comExternalInvokeLog.setSERVICECODE(servicecode);//服务编码
					log.info("插入日志表开始");
					comExternalInvokeLogMapper.insertSelective(comExternalInvokeLog);
					log.info("插入日志表结束");
					List<ResultBean> list = new ArrayList<ResultBean>();
					List<String> magList = new ArrayList<String>();
					List<String> provinceInsert = new ArrayList<String>();
					for(int i = 0;i < detailslist.size();i++) {
                        dataMap = (Map<String, String>) detailslist.get(i);

                        String documentID = dataMap.get("DocumentID"); // 获取业务类型
                        String base64 = dataMap.get("Base64"); // 获取加密数据
                        String decryption = Base64Util.decryption(base64); // 加密数据进行解密

                        try {
                            // 拼接省入参 Header
                            HeaderContextBean header = new HeaderContextBean();
                            header.setSendSystemId("APP0001");// 发送数据的业务系统的系统编码，由数据中心平台指定。
                            header.setOrganizationId(OrganizationId);// 发起交易的医疗机构代码，由平台统一分配
                            header.setDocumentID(documentID);// 交易编号，同入参serviceType
                            header.setUserId(userId);// 用户名
                            header.setPwd(pwd);// 密码
                            header.setRequestTime(DateUtil.getSysDate("yyyy-mm-dd hh:mm:ss"));// 请求时间，格式yyyy-mm-dd hh:mm:ss
                            header.setClient_IP(clientIp);// 请求终端的IP地址，IPv4，格式如255.255.255.255
                            header.setClient_Mac(clientMac);// 请求终端的MAC地址，大写，格式如00-FF-08-32-83-C1
                            XStream xstream = new XStream();
                            xstream.alias("Header", HeaderContextBean.class);
                            String requestHeader = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" + xstream.toXML(header);
                            requestHeader = requestHeader.replace("__", "_");

                            // 拼接省入参Body
                            SAXReader saxReader = new SAXReader();
                            Document document = saxReader.read(new StringReader(decryption));
                            Element root = document.getRootElement();
                            root.setName("Body");
                            String requestBody = document.asXML();

                            String provinceInsertShow  = requestHeader + requestBody + "\n" + "----------------------------------------" + "\n";
                            provinceInsert.add(provinceInsertShow);

                            // 调用省平台方法
                            RouterService routerService = new RouterService();// 创建视图
                            IRouterService iRouterService = routerService.getPort(IRouterService.class);// 获取服务实现类
                            Holder outMsg = new Holder<String>();
                            Holder<Integer> runServiceResult = new Holder<Integer>();
                            log.info("调用省服务开始");

                            iRouterService.runService(documentID, requestHeader, requestBody, outMsg, runServiceResult);
                            log.info("调用省服务结束");

                            magList.add(outMsg.value.toString() + "\n" + "----------------------------------------" + "\n");

                            outMsg.value.toString();

                            Document doc = null;
                            String retDisp = null;

                            // 下面的是通过解析xml字符串的
                            doc = DocumentHelper.parseText(outMsg.value.toString()); // 将字符串转为XML

                            Element rootElt = doc.getRootElement(); // 获取根节点
                            Iterator iter = rootElt.elementIterator("Result"); // 获取根节点Body下的子节点Result
                            // 遍历result节点
                            while (iter.hasNext()) {
                                Element recordEle = (Element) iter.next();

                                String code = recordEle.elementTextTrim("Code"); // 取result节点下的子节点code值
                                String msg = recordEle.elementTextTrim("Msg"); // 取result节点下的子节点msg值

                                if (code.equals("0")) {
                                    retDisp = "对账成功";
                                    comExternalInvokeLog.setPROGRESS_STATUS_NAME("上报省平台成功");
                                    comExternalInvokeLog.setPROGRESS_STATUS_CODE("3");
                                    comExternalInvokeLogMapper.updateByPrimaryKeySelective(comExternalInvokeLog);
                                } else {
                                    retDisp = "对账失败，原因如下：" + msg;
                                    comExternalInvokeLog.setPROGRESS_STATUS_NAME("上报省平台失败");
                                    comExternalInvokeLog.setPROGRESS_STATUS_CODE("4");
                                    comExternalInvokeLogMapper.updateByPrimaryKeySelective(comExternalInvokeLog);
                                }
                                ResultBean resultBean = new ResultBean();
                                resultBean.setReturnMessage(retDisp);
                                list.add(resultBean);
                                log.info(retDisp + msg);
                            }
                        } catch (Exception e) {
                            returnMessageBean.setRetcode("-1");
                            returnMessageBean.setRettext(e.getMessage());
                            errMsg.append("对账异常");
                            log.error("对账异常," + e);
                        }
                    }
                    returnMessageBean.setReturnQueryList(list, "0");

                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i = 0;i < magList.size();i++) {
                        stringBuffer.append(magList.get(i));
                    }

                    StringBuffer buffer = new StringBuffer();
                    for (int i = 0;i < provinceInsert.size();i++) {
                        buffer.append(provinceInsert.get(i));
                    }

                    comExternalInvokeLog.setPROVINCE_OUTPUT_SHOW(stringBuffer.toString());
                    comExternalInvokeLog.setPROVINCE_INSERT_SHOW(buffer.toString());
                    comExternalInvokeLog.setCITY_OUTPUT_SHOW(returnMessageBean.parseDocument());
                    comExternalInvokeLogMapper.updateByPrimaryKeySelective(comExternalInvokeLog);
				}
				break;
		}
	}
}