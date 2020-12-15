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
 * @Description 严重精神障碍专项档案
 * @return
 * @date 2020/12/15 11:00
 */
@Data
@Table(name = "JS01")
@NameStyle(Style.uppercase)
public class Js01 {

    // 发送第三方系统内部记录唯一标识，用于后续更新识别
    @Id
    @Column( name = "ID")
    private String ID;

    // 患者姓名
    @Column( name = "XM")
    private String XM;

    // 身份证号
    @Column( name = "SFZH")
    private String SFZH;

    // 档案编号
    @Column( name = "SGBH")
    private String SGBH;

    // 户别
    @Column( name = "HKSX")
    private String HKSX;

    // 出生日期
    @Column( name = "CSRQ")
    private String CSRQ;

    // 其他证件
    @Column( name = "QTZJ")
    private String QTZJ;

    // 证件号码
    @Column( name = "ZJHM")
    private String ZJHM;

    // 性别
    @Column( name = "XB")
    private String XB;

    // 籍贯
    @Column( name = "JGDM")
    private String JGDM;

    // 民族
    @Column( name = "MZDM")
    private String MZDM;

    // 婚姻状况
    @Column( name = "HYDM")
    private String HYDM;

    // 文化程度
    @Column( name = "WHCD")
    private String WHCD;

    // 就业情况
    @Column( name = "ZYDM")
    private String ZYDM;

    // 宗教
    @Column( name = "ZJDM")
    private String ZJDM;

    // 医疗保障
    @Column( name = "YLDY")
    private String YLDY;

    // ABO血型
    @Column( name = "XXDM")
    private String XXDM;

    // Rh血型
    @Column( name = "RHXXLX")
    private String RHXXLX;

    // 经济状况
    @Column( name = "JJZK")
    private String JJZK;

    // 共同居住者
    @Column( name = "GTJZZ")
    private String GTJZZ;

    // 共同居住者其他
    @Column( name = "GTJZZQT")
    private String GTJZZQT;

    // 两系三代重性精神疾病家族史
    @Column( name = "JSJBJZS")
    private String JSJBJZS;

    // 两系三代重性精神疾病家族史情况
    @Column( name = "JSBJZSQK")
    private String JSBJZSQK;

    // 管理所在行政区划
    @Column( name = "GLSZXZQH")
    private String GLSZXZQH;

    // 户籍详细地址
    @Column( name = "HJXXDZ")
    private String HJXXDZ;

    // 户籍地址编码
    @Column( name = "HJDZBM")
    private String HJDZBM;

    // 户籍地址类型
    @Column( name = "HJDZLX")
    private String HJDZLX;

    // 现住址详细地址
    @Column( name = "XZDXXDZ")
    private String XZDXXDZ;

    // 现住地址编码
    @Column( name = "JZDZBM")
    private String JZDZBM;

    // 现住地址类型
    @Column( name = "JZDZLX")
    private String JZDZLX;

    // 工作单位
    @Column( name = "GZDW")
    private String GZDW;

    // 工作单位联系人及电话
    @Column( name = "GZDWLXRJDH")
    private String GZDWLXRJDH;

    // 是否接受监护
    @Column( name = "SFJSJH")
    private String SFJSJH;

    // 个人状态
    @Column( name = "GRZT")
    private String GRZT;

    // 管理状态
    @Column( name = "GLZT")
    private String GLZT;

    // 供史者姓名
    @Column( name = "GSZXM")
    private String GSZXM;

    // 供史者地址
    @Column( name = "GSZDZ")
    private String GSZDZ;

    // 监护人姓名
    @Column( name = "JHRXM")
    private String JHRXM;

    // 监护人电话/联系人电话
    @Column( name = "JHRDH")
    private String JHRDH;

    // 与患者关系
    @Column( name = "JHRYHZGX")
    private String JHRYHZGX;

    // 监护人地址
    @Column( name = "JHRDZ")
    private String JHRDZ;

    // 辖区村（居）委会联系人、电话
    @Column( name = "JWHLXRJDH")
    private String JWHLXRJDH;

    // 目前诊断
    @Column( name = "MQZD")
    private String MQZD;

    // 确诊日期
    @Column( name = "QZRQ")
    private String QZRQ;

    // 确诊医院
    @Column( name = "QZYY")
    private String QZYY;

    // 初次发病时间
    @Column( name = "CCFBSJ")
    private String CCFBSJ;

    // 初次发病时间精确度
    @Column( name = "CCFBSJJD")
    private String CCFBSJJD;

    // 起病形式
    @Column( name = "QBXS")
    private String QBXS;

    // 其他疾病诊断
    @Column( name = "QTJBZD")
    private String QTJBZD;

    // 曾患疾病
    @Column( name = "CHJB")
    private String CHJB;

    // 现患疾病
    @Column( name = "XHJB")
    private String XHJB;

    // 更改诊断
    @Column( name = "GGZD")
    private String GGZD;

    // 更改诊断概况
    @Column( name = "GGZDQK")
    private String GGZDQK;

    // 既往主要症状
    @Column( name = "JWZYZZ")
    private String JWZYZZ;

    // 既往主要症状其他
    @Column( name = "YWZZ")
    private String YWZZ;

    // 其他躯体症状
    @Column( name = "QTZZ")
    private String QTZZ;

    // 危险行为
    @Column( name = "HZDJTSHDYX")
    private String HZDJTSHDYX;

    // 轻度滋事
    @Column( name = "QDZSCS")
    private String QDZSCS;

    // 肇事
    @Column( name = "ZAOSHICS")
    private String ZAOSHICS;

    // 肇祸
    @Column( name = "ZAOHUOCS")
    private String ZAOHUOCS;

    // 自伤
    @Column( name = "ZSCS")
    private String ZSCS;

    // 自杀未遂
    @Column( name = "ZSWSCS")
    private String ZSWSCS;

    // 其他危害行为
    @Column( name = "QTWHXWCS")
    private String QTWHXWCS;

    // 其他影响
    @Column( name = "QTYX")
    private String QTYX;

    // 既往关锁情况
    @Column( name = "JWGSQK")
    private String JWGSQK;

    // 既往治疗情况
    @Column( name = "JWZLQK")
    private String JWZLQK;

    // 既往治疗形式
    @Column( name = "JWZLXS")
    private String JWZLXS;

    // 门诊
    @Column( name = "JWMZ")
    private String JWMZ;

    // 曾住精神专科医院/综合医院精神专科（次）
    @Column( name = "JWZYC")
    private String JWZYC;

    // 末次出院日期
    @Column( name = "MCCYRQ")
    private String MCCYRQ;

    // 建档前是否已进行抗精神疾病药物治疗
    @Column( name = "SFYWZL")
    private String SFYWZL;

    // 首次抗严重精神障碍药治疗时间
    @Column( name = "SCYWZLSJ")
    private String SCYWZLSJ;

    // 首次抗严重精神障碍药治疗时间精确度
    @Column( name = "SCYWZLSJJD")
    private String SCYWZLSJJD;

    // 用过何种药物
    @Column( name = "YGHZYW")
    private String YGHZYW;

    // 服药情况
    @Column( name = "JWFYQK")
    private String JWFYQK;

    // 不良反应
    @Column( name = "YWYZBLFY")
    private String YWYZBLFY;

    // 严重不良反应
    @Column( name = "JWBLFY")
    private String JWBLFY;

    // 不良反应其他
    @Column( name = "QTJWBLFY")
    private String QTJWBLFY;

    // 最近一次治疗效果
    @Column( name = "ZJYCZLXG")
    private String ZJYCZLXG;

    // 职业和工作
    @Column( name = "ZYHGZ")
    private String ZYHGZ;

    // 婚姻职能
    @Column( name = "HYZN")
    private String HYZN;

    // 父母职能
    @Column( name = "FMZN")
    private String FMZN;

    // 社会性退缩
    @Column( name = "SHXTS")
    private String SHXTS;

    // 家庭外的社会活动
    @Column( name = "JTWSHHD")
    private String JTWSHHD;

    // 家庭内活动
    @Column( name = "JTNHD")
    private String JTNHD;

    // 家庭职能
    @Column( name = "JTZN")
    private String JTZN;

    // 个人生活自理
    @Column( name = "GRSHZL")
    private String GRSHZL;

    // 对外界兴趣和关心
    @Column( name = "DWJXQHGX")
    private String DWJXQHGX;

    // 责任心和计划性
    @Column( name = "ZRXHJHX")
    private String ZRXHJHX;

    // SDSS总分
    @Column( name = "SDSSZF")
    private String SDSSZF;

    // 劳动力
    @Column( name = "LDL")
    private String LDL;

    // 学习新知识及技能
    @Column( name = "XXXZSJJN")
    private String XXXZSJJN;

    // 治疗形式
    @Column( name = "JYZLXS")
    private String JYZLXS;

    // 药物治疗归类
    @Column( name = "JYYWZLGL")
    private String JYYWZLGL;

    // 药物治疗归类其他
    @Column( name = "JYYWZLQT")
    private String JYYWZLQT;

    // 药物治疗
    @Column( name = "YWZL")
    private String YWZL;

    // 其他药物治疗
    @Column( name = "JYQTYWZL")
    private String JYQTYWZL;

    // 康复措施
    @Column( name = "JYKFCS")
    private String JYKFCS;

    // 是否进行精神病相关鉴定
    @Column( name = "SFJXJSBXGJD")
    private String SFJXJSBXGJD;

    // 司法鉴定结论
    @Column( name = "SFJDJL")
    private String SFJDJL;

    // 司法鉴定证号
    @Column( name = "SFJDZH")
    private String SFJDZH;

    // 劳动能力鉴定结论
    @Column( name = "LDNLJDJL")
    private String LDNLJDJL;

    // 伤残鉴定结论
    @Column( name = "SCJDJL")
    private String SCJDJL;

    // 残疾鉴定证号
    @Column( name = "CJJDZH")
    private String CJJDZH;

    // 智力残疾
    @Column( name = "ZLCJ")
    private String ZLCJ;

    // （残疾证）鉴定日期
    @Column( name = "CJJDSJ")
    private String CJJDSJ;

    // 有无签署知情同意书
    @Column( name = "SFQSZQS")
    private String SFQSZQS;

    // 知情同意
    @Column( name = "ZQTY")
    private String ZQTY;

    // 签字日期
    @Column( name = "QZSJ")
    private String QZSJ;

    // 签字人
    @Column( name = "QZ")
    private String QZ;

    // 是否纳入管理
    @Column( name = "SFNRGL")
    private String SFNRGL;

    // 纳入管理日期
    @Column( name = "NRGLSJ")
    private String NRGLSJ;

    // 是否接受医疗救助
    @Column( name = "SFJSYLJZ")
    private String SFJSYLJZ;

    // 开始免费用药日期
    @Column( name = "KSMFYYRQ")
    private String KSMFYYRQ;

    // 纳入服务类型
    @Column( name = "NRFWLX")
    private String NRFWLX;

    // 纳入个案管理前是否已纳入基础管理
    @Column( name = "SFYNRJCGL")
    private String SFYNRJCGL;

    // 个案管理起始日期
    @Column( name = "QSSJ")
    private String QSSJ;

    // 备注
    @Column( name = "BZ")
    private String BZ;

    // 专科医生意见
    @Column( name = "ZKYSJY")
    private String ZKYSJY;

    // 建档人ID
    @Column( name = "TBR")
    private String TBR;

    // 建档人
    @Column( name = "TBRXM")
    private String TBRXM;

    // 建档日期
    @Column( name = "TBRQ")
    private String TBRQ;

    // 死亡原因
    @Column( name = "JSBSWYY")
    private String JSBSWYY;

    // 死亡日期
    @Column( name = "SWRQ")
    private String SWRQ;

    // 录入人ID
    @Column( name = "LRR")
    private String LRR;

    // 录入人姓名
    @Column( name = "LRRXM")
    private String LRRXM;

    // 录入日期
    @Column( name = "LRRQ")
    private String LRRQ;

    // 作废标志
    @Column( name = "ZFBZ")
    private String ZFBZ;

    // 是否为精准扶贫对象
    @Column( name = "SFJZFP")
    private String SFJZFP;

    // 是否为监护补助对象
    @Column( name = "SFJHBZ")
    private String SFJHBZ;

    // 是否为关爱帮扶小组服务对象
    @Column( name = "SFGAFP")
    private String SFGAFP;

    // 是否为家庭医师签约服务对象
    @Column( name = "SFQYDX")
    private String SFQYDX;

    // 是否参加社区康复服务
    @Column( name = "SFCJSQ")
    private String SFCJSQ;

    // 领取残疾人证情况
    @Column( name = "LQCJZQK")
    private String LQCJZQK;

    // 残疾证等级
    @Column( name = "CJZDJ")
    private String CJZDJ;

    // 既往危险行为
    @Column( name = "JWWXXW")
    private String JWWXXW;

    // 国籍编码
    @Column( name = "GJ")
    private String GJ;

    // 国籍名称
    @Column( name = "GJMC")
    private String GJMC;

    // 现住地类别
    @Column( name = "XZDLB")
    private String XZDLB;

    // 户别不详原因
    @Column( name = "HBBXYY")
    private String HBBXYY;
}
