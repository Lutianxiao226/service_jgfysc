package com.neusoft.hz.model;

import com.neusoft.hz.comp.hsbservice.common.annotation.ReturnType;
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
 * @date 2020/9/19 20:43
 */
@Table(name = "WAC_UPLOAD_INFO")
@NameStyle(Style.uppercase)
public class WacUploadInfo {

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

    public String getSERIALNUM_ID() {
        return SERIALNUM_ID;
    }

    public void setSERIALNUM_ID(String SERIALNUM_ID) {
        this.SERIALNUM_ID = SERIALNUM_ID;
    }

    public String getRECORD_ID() {
        return RECORD_ID;
    }

    public void setRECORD_ID(String RECORD_ID) {
        this.RECORD_ID = RECORD_ID;
    }

    public String getDocumentID() { return DocumentID; }

    public void setDocumentID(String documentID) { DocumentID = documentID; }

    public String getBase64() {
        return Base64;
    }

    public void setBase64(String base64) {
        Base64 = base64;
    }

    public String getSOURCEORGAN() {
        return SOURCEORGAN;
    }

    public void setSOURCEORGAN(String SOURCEORGAN) {
        this.SOURCEORGAN = SOURCEORGAN;
    }

    public String getSOURCEDOMAIN() {
        return SOURCEDOMAIN;
    }

    public void setSOURCEDOMAIN(String SOURCEDOMAIN) {
        this.SOURCEDOMAIN = SOURCEDOMAIN;
    }

    public String getPARSE_XML() { return PARSE_XML; }

    public void setPARSE_XML(String PARSE_XML) {
        this.PARSE_XML = PARSE_XML;
    }

    public String getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(String CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

}
