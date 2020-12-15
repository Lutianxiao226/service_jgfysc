package com.neusoft.hz.model;

import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @param
 * @author lutianxiao
 * @Description
 * @return
 * @date 2020/12/15 11:00
 */
@Data
@Table(name = "WAC_UPLOAD_INFO_PSYCHOSIS")
@NameStyle(Style.uppercase)
public class WacUploadInfoPsychosis {

    // SERIALNUM_ID 市平台数据主键
    @Id
    @Column( name = "SERIALNUM_ID")
    private String SERIALNUM_ID;

    // RECORD_ID 记录ID
    @Column( name = "RECORD_ID")
    private String RECORD_ID;

    // DOCUMENTID 业务类型
    @Column( name = "DOCUMENTID")
    private String DocumentID;

    // BASE64 加密业务数据
    @Column( name = "BASE64")
    private String Base64;

    // SOURCEORGAN 机构编码
    @Column( name = "SOURCEORGAN")
    private String SOURCEORGAN;

    // SOURCEDOMAIN 系统编码
    @Column( name = "SOURCEDOMAIN")
    private String SOURCEDOMAIN;

    // PARSE_XML 解析XML
    @Column( name = "PARSE_XML")
    private String PARSE_XML;

    // CREATE_TIME 创建时间
    @Column( name = "CREATE_TIME")
    private String CREATE_TIME;
}
