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
 * @Description 门诊服药补助
 * @return
 * @date 2020/12/15 15:00
 */
@Data
@Table(name = "JS07")
@NameStyle(Style.uppercase)
public class Js07 {

    // 记录标识
    @Id
    @Column( name = "ID")
    private String ID;

    // 专项ID
    @Column( name = "ZXID")
    private String ZXID;

    // 门诊就诊医院
    @Column( name = "MZJZYY")
    private String MZJZYY;

    // 门诊就诊医院名称
    @Column( name = "MZJZYYMC")
    private String MZJZYYMC;

    // 门诊医院病历号
    @Column( name = "MZBLH")
    private String MZBLH;

    // 用药医生
    @Column( name = "YYYS")
    private String YYYS;

    // 门诊服药日期
    @Column( name = "SCMYYYSJ")
    private String SCMYYYSJ;

    // 用药种类
    @Column( name = "YYZL")
    private String YYZL;

    // 门诊服药药物名称和剂量
    @Column( name = "SCMFYYYWMCHJL")
    private String SCMFYYYWMCHJL;

    // 门诊服药补助金额
    @Column( name = "NMYYJE")
    private String NMYYJE;

    // 填表人ID
    @Column( name = "TBR")
    private String TBR;

    // 填表人
    @Column( name = "TBRMC")
    private String TBRMC;

    // 填表日期
    @Column( name = "TBRQ")
    private String TBRQ;

    // 审核人ID
    @Column( name = "SHR")
    private String SHR;

    // 审核人
    @Column( name = "SHRMC")
    private String SHRMC;

    // 审核日期
    @Column( name = "SHRQ")
    private String SHRQ;

    // 审核单位
    @Column( name = "SHDW")
    private String SHDW;

    // 审核单位名称
    @Column( name = "SHDWMC")
    private String SHDWMC;

    // 录入人ID
    @Column( name = "LRR")
    private String LRR;

    // 录入人
    @Column( name = "LRRXM")
    private String LRRXM;

    // 录入日期
    @Column( name = "LRRQ")
    private String LRRQ;

    // 作废标识
    @Column( name = "ZFBZ")
    private String ZFBZ;

}
