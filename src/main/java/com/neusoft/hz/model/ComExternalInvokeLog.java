package com.neusoft.hz.model;

import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @param
 * @author meng-fch
 * @Description
 * @return
 * @date 2020/10/16 13:58
 */
@Data
@Table(name = "COM_EXTERNAL_INVOKE_LOG")
@NameStyle(Style.uppercase)
public class ComExternalInvokeLog {

    // RECORD_ID记录id主键
    @Id
    @Column( name = "RECORD_ID")
    private String RECORD_ID;

    // SOURCEORGAN机构编码
    @Column( name = "SOURCEORGAN")
    private String SOURCEORGAN;

    // SOURCEDOMAIN系统编码
    @Column( name = "SOURCEDOMAIN")
    private String SOURCEDOMAIN;

    // PROGRESS_STATUS_CODE进度状态（1上报市平台成功2上报市平台失败3上报省平台成功4上报省平台失败）
    @Column( name = "PROGRESS_STATUS_CODE")
    private String PROGRESS_STATUS_CODE;

    // PROGRESS_STATUS_NAME数据传输状态名称
    @Column( name = "PROGRESS_STATUS_NAME")
    private String PROGRESS_STATUS_NAME;

    // CITY_INSERT_SHOW市平台入参
    @Column( name = "CITY_INSERT_SHOW")
    private String CITY_INSERT_SHOW;

    // CITY_OUTPUT_SHOW市平台出参
    @Column( name = "CITY_OUTPUT_SHOW")
    private String CITY_OUTPUT_SHOW;

    // PROVINCE_INSERT_SHOW省平台入参
    @Column( name = "PROVINCE_INSERT_SHOW")
    private String PROVINCE_INSERT_SHOW;

    // PROVINCE_OUTPUT_SHOW省平台出参
    @Column( name = "PROVINCE_OUTPUT_SHOW")
    private String PROVINCE_OUTPUT_SHOW;

    // CREATE_TIME创建时间
    @Column( name = "CREATE_TIME")
    private String CREATE_TIME;

    // SERVICECODE服务编码
    @Column( name = "SERVICECODE")
    private String SERVICECODE;

}
