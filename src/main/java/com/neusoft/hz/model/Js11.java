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
 * @Description 出院信息单
 * @return
 * @date 2020/12/15 15:00
 */
@Data
@Table(name = "JS11")
@NameStyle(Style.uppercase)
public class Js11 {

    // 记录标识
    @Id
    @Column( name = "ID")
    private String ID;

    // 民族
    @Column( name = "MZDM")
    private String MZDM;

    // 出生日期
    @Column( name = "CSRQ")
    private String CSRQ;

    // 身份证号
    @Column( name = "SFZH")
    private String SFZH;

    // 作废标识
    @Column( name = "ZFBZ")
    private String ZFBZ;

    // 录入日期
    @Column( name = "LRRQ")
    private String LRRQ;

    // 录入人ID
    @Column( name = "LRR")
    private String LRR;

    // 录入人
    @Column( name = "LRRXM")
    private String LRRXM;

    // 性别
    @Column( name = "XB")
    private String XB;

    // 下次用药
    @Column( name = "XCYYlIST")
    private String XCYYlIST;

    // 患者姓名
    @Column( name = "XM")
    private String XM;

    // 住院用药
    @Column( name = "ZYYYlIST")
    private String ZYYYlIST;

    // 联系电话
    @Column( name = "JZYSLXDH")
    private String JZYSLXDH;

    // 经治医生
    @Column( name = "JZYSXM")
    private String JZYSXM;

    // 备注
    @Column( name = "BZ")
    private String BZ;

    // 其他注意事项
    @Column( name = "QTZYSX")
    private String QTZYSX;

    // 康复措施其他
    @Column( name = "KFCSXS")
    private String KFCSXS;

    // 康复措施
    @Column( name = "KFCS")
    private String KFCS;

    // 报告单位
    @Column( name = "BGDW")
    private String BGDW;

    // 报告单位名称
    @Column( name = "BGDWBM")
    private String BGDWBM;

    // 知情同意签字时间
    @Column( name = "QZSJ")
    private String QZSJ;

    // 知情同意
    @Column( name = "ZQTY")
    private String ZQTY;

    // 危险行为
    @Column( name = "BCRYYY")
    private String BCRYYY;

    // 住院疗效
    @Column( name = "ZYLX")
    private String ZYLX;

    // 出院诊断
    @Column( name = "CYZD")
    private String CYZD;

    // 住院病案号
    @Column( name = "ZYBAN")
    private String ZYBAN;

    // 门诊病案号
    @Column( name = "MZBAH")
    private String MZBAH;

    // 曾住精神专科医院/综合医院精神专科（含此次住院）（次）
    @Column( name = "ZYCS")
    private String ZYCS;

    // 门诊既往治疗情况
    @Column( name = "MZJWZLQK")
    private String MZJWZLQK;

    // 出院日期
    @Column( name = "CYRQ")
    private String CYRQ;

    // 报告地区编码
    @Column( name = "BGDQ")
    private String BGDQ;

    // 报告地区
    @Column( name = "BGDQMC")
    private String BGDQMC;

    // 入院日期
    @Column( name = "RYRQ")
    private String RYRQ;

    // ICD10编码
    @Column( name = "JBDM")
    private String JBDM;

    // 确诊日期
    @Column( name = "QZRQ")
    private String QZRQ;

    // 疾病名称
    @Column( name = "JBMC")
    private String JBMC;

    // 确诊医院
    @Column( name = "QZYY")
    private String QZYY;

    // 送诊主体—其他详述
    @Column( name = "SZZTQTXS")
    private String SZZTQTXS;

    // 送诊主体
    @Column( name = "SZZT")
    private String SZZT;

    // 初次发病时间精确度
    @Column( name = "CCFBSJJD")
    private String CCFBSJJD;

    // 初次发病时间
    @Column( name = "CCFBSJ")
    private String CCFBSJ;

    // 卡片编号
    @Column( name = "KPBH")
    private String KPBH;

    // 户籍地址编码
    @Column( name = "HJDZBM")
    private String HJDZBM;

    // 户籍详细地址
    @Column( name = "HJXXDZ")
    private String HJXXDZ;

    // 户籍地址类型
    @Column( name = "HJDZLX")
    private String HJDZLX;

    // 户籍地址
    @Column( name = "HJDZ")
    private String HJDZ;

    // 现住地址编码
    @Column( name = "JZDZBM")
    private String JZDZBM;

    // 现住址详细地址
    @Column( name = "JZXXDZ")
    private String JZXXDZ;

    // 现住地址类型
    @Column( name = "JZDZLX")
    private String JZDZLX;

    // 现住地址
    @Column( name = "JZDZ")
    private String JZDZ;

    // 联系人电话
    @Column( name = "LXRDH")
    private String LXRDH;

    // 联系人姓名
    @Column( name = "LXRXM")
    private String LXRXM;

    // 与患者关系
    @Column( name = "JHRYHZGX")
    private String JHRYHZGX;

    // 两系三代严重精神障碍家族史
    @Column( name = "JSJBJZS")
    private String JSJBJZS;

    // 婚姻状况
    @Column( name = "HYDM")
    private String HYDM;

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

    // 危险性评估
    @Column( name = "WXX")
    private String WXX;

    // 医院名称
    @Column( name = "yymc")
    private String yymc;

    // 出院诊断代码
    @Column( name = "CYZDDM")
    private String CYZDDM;

    // 签字日期
    @Column( name = "JZYSQZRQ")
    private String JZYSQZRQ;


}
