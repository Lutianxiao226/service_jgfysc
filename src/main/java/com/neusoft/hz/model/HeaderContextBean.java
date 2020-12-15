package com.neusoft.hz.model;

import lombok.Data;

/**
 * @param
 * @author meng-fch
 * @Description
 * @return
 * @date 2020/9/22 20:31
 */
@Data
public class HeaderContextBean {

    // 发送数据的业务系统的系统编码，由数据中心平台指定。
    private String SendSystemId;

    // 发起交易的医疗机构代码，由平台统一分配
    private String OrganizationId;

    // 交易编号，同入参serviceType。
    private String DocumentID;

    // 用户名，区分大小写
    private String UserId;

    // 密码，区分大小写
    private String Pwd;

    // 请求时间，格式yyyy-mm-dd hh:mm:ss
    private String RequestTime;

    // 请求终端的IP地址，IPv4，格式如255.255.255.255
    private String Client_IP;

    // 请求终端的MAC地址，大写，格式如00-FF-08-32-83-C1
    private String Client_Mac;
}
