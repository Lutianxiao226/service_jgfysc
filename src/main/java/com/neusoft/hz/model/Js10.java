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
 * @Description 发病报告卡
 * @return
 * @date 2020/12/15 15:00
 */
@Data
@Table(name = "JS10")
@NameStyle(Style.uppercase)
public class Js10 {

    // 发病报告的主键
    @Id
    @Column( name = "ID")
    private String ID;

    // 卡片编号
    @Column( name = "KPBH")
    private String KPBH;

    // 报告地区
    @Column( name = "BGDQ")
    private String BGDQ;

    // 报告地区编码
    @Column( name = "BGDQBM")
    private String BGDQBM;

    // 报告单位
    @Column( name = "BGDW")
    private String BGDW;

    // 报告单位编码
    @Column( name = "BGDWBM")
    private String BGDWBM;

    // 患者姓名
    @Column( name = "XM")
    private String XM;

    // 监护人姓名
    @Column( name = "LXRXM")
    private String LXRXM;

    // 监护人电话
    @Column( name = "LXRDH")
    private String LXRDH;

    // 身份证号
    @Column( name = "SFZH")
    private String SFZH;

    // 性别
    @Column( name = "XB")
    private String XB;

    // 出生日期
    @Column( name = "CSRQ")
    private String CSRQ;

    // 现住地址类型
    @Column( name = "JZDZLX")
    private String JZDZLX;

    // 现住地址
    @Column( name = "JZDZ")
    private String JZDZ;

    // 现住址详细地址
    @Column( name = "JZXXDZ")
    private String JZXXDZ;

    // 现住地址编码
    @Column( name = "JZDZBM")
    private String JZDZBM;

    // 户籍地址类型
    @Column( name = "HJDZLX")
    private String HJDZLX;

    // 户籍地址
    @Column( name = "HJDZ")
    private String HJDZ;

    // 户籍详细地址
    @Column( name = "HJXXDZ")
    private String HJXXDZ;

    // 户籍地址编码
    @Column( name = "HJDZBM")
    private String HJDZBM;

    // 就业情况
    @Column( name = "ZY")
    private String ZY;

    // 初次发病时间
    @Column( name = "CCFBSJ")
    private String CCFBSJ;

    // 初次发病时间精确度
    @Column( name = "CCFBSJJD")
    private String CCFBSJJD;

    // 送诊主体
    @Column( name = "SZZT")
    private String SZZT;

    // 送诊主体—其他详述
    @Column( name = "SZZTQTXS")
    private String SZZTQTXS;

    // 确诊医院
    @Column( name = "QZYY")
    private String QZYY;

    // 确诊日期
    @Column( name = "QZRQ")
    private String QZRQ;

    // 疾病名称
    @Column( name = "JBMC")
    private String JBMC;

    // ICD10编码
    @Column( name = "JBDM")
    private String JBDM;

    // 知情同意
    @Column( name = "ZQTY")
    private String ZQTY;

    // 知情同意签字日期
    @Column( name = "QZSJ")
    private String QZSJ;

    // 既往危险行为
    @Column( name = "BCJZYY")
    private String BCJZYY;

    // 备注
    @Column( name = "BZ")
    private String BZ;

    // 填卡医生
    @Column( name = "TKYSXM")
    private String TKYSXM;

    // 填卡日期
    @Column( name = "TKRQ")
    private String TKRQ;

    // 报告科室
    @Column( name = "BGKS")
    private String BGKS;

    // 联系电话
    @Column( name = "LXDH")
    private String LXDH;

    // 患者信息完整性
    @Column( name = "HZXXWZX")
    private String HZXXWZX;

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

    // 与患者关系
    @Column( name = "JHRYHZGX")
    private String JHRYHZGX;

    // 两系三代严重精神障碍家族史
    @Column( name = "JSJBJZS")
    private String JSJBJZS;

    // 婚姻状况
    @Column( name = "HYDM")
    private String HYDM;

    // 民族
    @Column( name = "MZDM")
    private String MZDM;

    // 文化程度
    @Column( name = "WHCD")
    private String WHCD;

    // 户别
    @Column( name = "HKSX")
    private String HKSX;

    // 是否药物治疗
    @Column( name = "SFYWZL")
    private String SFYWZL;

    // 首次抗精神疾病药物治疗时间
    @Column( name = "SCYWZLSJ")
    private String SCYWZLSJ;

    // 既往危险性评估
    @Column( name = "WXX")
    private String WXX;

    // 患者来源
    @Column( name = "hzly")
    private String hzly;

    // 既往住院情况
    @Column( name = "jwzyc")
    private String jwzyc;

    // ICD-10 编码
    @Column( name = "Icd10bm")
    private String Icd10bm;

    // 目前用药情况
    @Column( name = "yyqk")
    private String yyqk;

    // 既往关锁情况
    @Column( name = "JWGSQK")
    private String JWGSQK;

}
