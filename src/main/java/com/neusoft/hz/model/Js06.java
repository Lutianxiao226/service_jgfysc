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
 * @Description 实验室检查
 * @return
 * @date 2020/12/15 15:00
 */
@Data
@Table(name = "JS06")
@NameStyle(Style.uppercase)
public class Js06 {

    // 记录标识
    @Id
    @Column( name = "ID")
    private String ID;

    // 专项ID
    @Column( name = "ZXID")
    private String ZXID;

    // 随访情况ID
    @Column( name = "SFQKID")
    private String SFQKID;

    // 检查日期
    @Column( name = "JCSJ")
    private String JCSJ;

    // 检查项目
    @Column( name = "JCXM")
    private String JCXM;

    // 其他检查项目
    @Column( name = "JCXMXS")
    private String JCXMXS;

    // 检查结果
    @Column( name = "JCJG")
    private String JCJG;

    // 异常检查项目
    @Column( name = "YCJCXM")
    private String YCJCXM;

    // 是否进行临床处置
    @Column( name = "SFJXLCCZ")
    private String SFJXLCCZ;

    // 处置方法
    @Column( name = "CZFF")
    private String CZFF;

    // 处置日期
    @Column( name = "CZSJ")
    private String CZSJ;

    // 填表人ID
    @Column( name = "TBR")
    private String TBR;

    // 填表人
    @Column( name = "TBRMC")
    private String TBRMC;

    // 填表日期
    @Column( name = "TBRQ")
    private String TBRQ;

    // 审核日期
    @Column( name = "SHRQ")
    private String SHRQ;

    // 审核单位
    @Column( name = "SHDW")
    private String SHDW;

    // 审核单位名称
    @Column( name = "SHDWMC")
    private String SHDWMC;

    // 填表单位
    @Column( name = "TBDW")
    private String TBDW;

    // 填表单位名称
    @Column( name = "TBDWMC")
    private String TBDWMC;

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
