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
 * @Description 住院医疗救助
 * @return
 * @date 2020/12/15 15:00
 */
@Data
@Table(name = "JS08")
@NameStyle(Style.uppercase)
public class Js08 {

    // 记录标识
    @Id
    @Column( name = "ID")
    private String ID;

    // 专项ID
    @Column( name = "ZXID")
    private String ZXID;

    // 就诊医院
    @Column( name = "JZYY")
    private String JZYY;

    // 就诊医院病历号
    @Column( name = "JZYYBLH")
    private String JZYYBLH;

    // 入院日期
    @Column( name = "RYRQ")
    private String RYRQ;

    // 住院天数
    @Column( name = "ZYTS")
    private String ZYTS;

    // 入院诊断
    @Column( name = "RYZD")
    private String RYZD;

    // 入院前是否进行应急处置
    @Column( name = "RYQSFJXYJCZ")
    private String RYQSFJXYJCZ;

    // 住院前肇事肇祸危险度分级
    @Column( name = "RYQZSZHWXDFJ")
    private String RYQZSZHWXDFJ;

    // 入院前有无药物副作用
    @Column( name = "RYQYWYWFZY")
    private String RYQYWYWFZY;

    // 副作用药物种类
    @Column( name = "YWFZYZL")
    private String YWFZYZL;

    // 采用的药物治疗
    @Column( name = "CYDYWZL")
    private String CYDYWZL;

    // 药物名称和剂量明细
    @Column( name = "YWMCHJLMX")
    private String YWMCHJLMX;

    // 出院时肇事肇祸危险度分级
    @Column( name = "CYSZSZHWXDFJ")
    private String CYSZSZHWXDFJ;

    // 出院诊断
    @Column( name = "CYZD")
    private String CYZD;

    // 出院时疗效
    @Column( name = "CYSLX")
    private String CYSLX;

    // 住院费用
    @Column( name = "ZYFY")
    private String ZYFY;

    // 家庭经济状况
    @Column( name = "JTJJZK")
    private String JTJJZK;

    // 户籍类别
    @Column( name = "HJLB")
    private String HJLB;

    // 享受医疗保险情况
    @Column( name = "XSYLBXQK")
    private String XSYLBXQK;

    // 救助类型
    @Column( name = "JZLX")
    private String JZLX;

    // 其他救助
    @Column( name = "QTJZ")
    private String QTJZ;

    // 救助日期
    @Column( name = "JZSJ")
    private String JZSJ;

    // 实际救助金额
    @Column( name = "SJJZJE")
    private String SJJZJE;

    // 监护人姓名
    @Column( name = "JHR")
    private String JHR;

    // 与患者关系
    @Column( name = "YHZGX")
    private String YHZGX;

    // 电话号码
    @Column( name = "DH")
    private String DH;

    // 填表人ID
    @Column( name = "TBR")
    private String TBR;

    // 填表人
    @Column( name = "TBRXM")
    private String TBRXM;

    // 填表日期
    @Column( name = "TBRQ")
    private String TBRQ;

    // 审核人ID
    @Column( name = "SHR")
    private String SHR;

    // 审核人
    @Column( name = "SHRXM")
    private String SHRXM;

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
