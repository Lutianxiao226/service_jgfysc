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
 * @Description 疾病与变动报告卡
 * @return
 * @date 2020/12/15 11:00
 */
@Data
@Table(name = "JS02")
@NameStyle(Style.uppercase)
public class Js02 {

    // 记录机器码
    @Id
    @Column( name = "ID")
    private String ID;

    // 专项档案记录标识
    @Column( name = "ZXID")
    private String ZXID;

    // 所属记录ID
    @Column( name = "SSJLID")
    private String SSJLID;

    // 变动情况
    @Column( name = "BDQK")
    private String BDQK;

    // 发生日期
    @Column( name = "FSRQ")
    private String FSRQ;

    // 失访原因
    @Column( name = "SFYY")
    private String SFYY;

    // 失访日期
    @Column( name = "SFRQ")
    private String SFRQ;

    // 死亡原因
    @Column( name = "SWYY")
    private String SWYY;

    // 躯体疾病详述
    @Column( name = "QTJBXS")
    private String QTJBXS;

    // 死亡日期
    @Column( name = "SWRQ")
    private String SWRQ;

    // 详细情况说明
    @Column( name = "XXQKSM")
    private String XXQKSM;

    // 责任医生ID
    @Column( name = "BGR")
    private String BGR;

    // 责任医生
    @Column( name = "BGRXM")
    private String BGRXM;

    // 报告日期
    @Column( name = "BGRQ")
    private String BGRQ;

    // 报告卡来源
    @Column( name = "BGKLY")
    private String BGKLY;

    // 录入人ID
    @Column( name = "LRR")
    private String LRR;

    // 录入人
    @Column( name = "LRRXM")
    private String LRRXM;

    // 录入日期
    @Column( name = "LRRQ")
    private String LRRQ;

    // 作废标志
    @Column( name = "ZFBZ")
    private String ZFBZ;
}
