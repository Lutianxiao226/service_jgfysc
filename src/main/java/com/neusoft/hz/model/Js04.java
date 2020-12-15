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
 * @Description 应急处置
 * @return
 * @date 2020/12/15 11:00
 */
@Data
@Table(name = "JS04")
@NameStyle(Style.uppercase)
public class Js04 {

    // 记录标识
    @Id
    @Column( name = "ID")
    private String ID;

    // 专项档案记录标识
    @Column( name = "ZXDAID")
    private String ZXDAID;

    // 随访ID
    @Column( name = "SFQKID")
    private String SFQKID;

    // 患者编号
    @Column( name = "HZBH")
    private String HZBH;

    // 第一处置地点
    @Column( name = "DYCZDD")
    private String DYCZDD;

    // 报告人
    @Column( name = "BGRXM")
    private String BGRXM;

    // 报告日期
    @Column( name = "BGRQ")
    private String BGRQ;

    // 报告途径
    @Column( name = "BGTJ")
    private String BGTJ;

    // 报告人身份
    @Column( name = "BGRSF")
    private String BGRSF;

    // 处置开始时间
    @Column( name = "CZKSSJ")
    private String CZKSSJ;

    // 处置结束时间
    @Column( name = "CZJSSJ")
    private String CZJSSJ;

    // 现场情况简要描述
    @Column( name = "XCQKJYMS")
    private String XCQKJYMS;

    // 精神科医师 1 ID
    @Column( name = "JSKYS1ID")
    private String JSKYS1ID;

    // 精神科医师 1
    @Column( name = "JSKYS1XM")
    private String JSKYS1XM;

    // 精神科医师 2ID
    @Column( name = "JSKYS2ID")
    private String JSKYS2ID;

    // 精神科医师 2
    @Column( name = "JSKYS2XM")
    private String JSKYS2XM;

    // 精神科护士 1ID
    @Column( name = "JSKHS1ID")
    private String JSKHS1ID;

    // 精神科护士 1
    @Column( name = "JSKHS1XM")
    private String JSKHS1XM;

    // 精神医生ID
    @Column( name = "JSKHS2ID")
    private String JSKHS2ID;

    // 精神医生 2
    @Column( name = "JSKHS2XM")
    private String JSKHS2XM;

    // 公安机关名称
    @Column( name = "GAJGMC")
    private String GAJGMC;

    // 经办警员
    @Column( name = "QZR")
    private String QZR;

    // 处置缘由
    @Column( name = "CZYY")
    private String CZYY;

    @Column( name = "CZYYCS")
    private String CZYYCS;

    // 处置缘由其他情况详述
    @Column( name = "CZYYQTQKXS")
    private String CZYYQTQKXS;

    // 主要处置措施
    @Column( name = "ZYCZCS")
    private String ZYCZCS;

    // 现场临时性处置次数
    @Column( name = "XCLSCZSL")
    private String XCLSCZSL;

    // 精神科门诊/急诊留观次数
    @Column( name = "JSKMZSL")
    private String JSKMZSL;

    // 精神科紧急住院次数
    @Column( name = "JSKJJZYSL")
    private String JSKJJZYSL;

    // 会诊次数
    @Column( name = "HZSL")
    private String HZSL;


    // 其他处置次数
    @Column( name = "QTCZCSSL")
    private String QTCZCSSL;

    // 其他主要处置措施
    @Column( name = "QTZYCZCS")
    private String QTZYCZCS;

    // 确诊诊断代码
    @Column( name = "ICDQZZDDM")
    private String ICDQZZDDM;

    // 确诊诊断名称
    @Column( name = "ICDQZZDMC")
    private String ICDQZZDMC;

    // 疑似诊断代码
    @Column( name = "ICDYSZDDM")
    private String ICDYSZDDM;

    // 疑似诊断名称
    @Column( name = "ICDYSZDMC")
    private String ICDYSZDMC;

    // 处置效果
    @Column( name = "CZXG")
    private String CZXG;

    // 处置对象来源
    @Column( name = "CZDXLY")
    private String CZDXLY;

    // 填表人
    @Column( name = "YJCZTBR")
    private String YJCZTBR;

    // 填表日期
    @Column( name = "YJCZTBRQ")
    private String YJCZTBRQ;

    // 应急医疗处置单位
    @Column( name = "YJYLCZDW")
    private String YJYLCZDW;

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

    // 危险性评估等级
    @Column( name = "WXXPGDJ")
    private String WXXPGDJ;

}
