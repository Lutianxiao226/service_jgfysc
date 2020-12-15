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
 * @Description 用药调整
 * @return
 * @date 2020/12/15 15:00
 */
@Data
@Table(name = "JS09")
@NameStyle(Style.uppercase)
public class Js09 {

    // 主键记录标识
    @Id
    @Column( name = "ID")
    private String ID;

    // 门诊服药补助ID
    @Column( name = "MFYYID")
    private String MFYYID;

    // 对上次治疗方案评价
    @Column( name = "DSCZLFAPJ")
    private String DSCZLFAPJ;

    // 调整原因
    @Column( name = "TZYY")
    private String TZYY;

    // 本次调整的药物种类
    @Column( name = "BBTZDYWZL")
    private String BBTZDYWZL;

    // 调整的用药药物名称和剂量
    @Column( name = "TZYYYWMCHJL")
    private String TZYYYWMCHJL;

    // 报告人ID
    @Column( name = "BGR")
    private String BGR;

    // 报告人
    @Column( name = "BGRMC")
    private String BGRMC;

    // 报告日期
    @Column( name = "BGRQ")
    private String BGRQ;

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
