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
 * @Description 严重精神障碍随访登记
 * @return
 * @date 2020/12/15 11:00
 */
@Data
@Table(name = "JS03")
@NameStyle(Style.uppercase)
public class Js03 {

    // 主键
    @Id
    @Column( name = "ID")
    private String ID;

    // 专项ID
    @Column( name = "ZXID")
    private String ZXID;

    // 随访对象
    @Column( name = "sfdx")
    private String sfdx;

    // 随访日期
    @Column( name = "SFRQ")
    private String SFRQ;

    // 本次随访形式
    @Column( name = "SFFS")
    private String SFFS;

    // 变动情况
    @Column( name = "BDQK")
    private String BDQK;

    // 目前就医方式
    @Column( name = "MQJYFS")
    private String MQJYFS;

    // 住院情况
    @Column( name = "ZYQK")
    private String ZYQK;

    // 住院患者是否获得经费补助
    @Column( name = "ZYHZSFHDJFBZ")
    private String ZYHZSFHDJFBZ;

    // 末次出院日期
    @Column( name = "MCCYSJ")
    private String MCCYSJ;

    // 末次出院时间精确度
    @Column( name = "MCCYSJJD")
    private String MCCYSJJD;

    // 目前症状
    @Column( name = "MQZZ")
    private String MQZZ;

    // 目前症状其他
    @Column( name = "MQZZQTXS")
    private String MQZZQTXS;

    // 睡眠情况
    @Column( name = "SMQK")
    private String SMQK;

    // 饮食情况
    @Column( name = "YSQK")
    private String YSQK;

    // 自知力
    @Column( name = "ZZL")
    private String ZZL;

    // 随访期间关锁情况
    @Column( name = "GSQK")
    private String GSQK;

    // 有无进行危险性行为评估
    @Column( name = "YWWXXXW")
    private String YWWXXXW;

    // 危险性评估
    @Column( name = "WXX")
    private String WXX;

    // 危险行为
    @Column( name = "HZDJTSHDYX")
    private String HZDJTSHDYX;

    // 轻度滋事
    @Column( name = "HZDJTSHDYXXS1")
    private String HZDJTSHDYXXS1;

    // 肇事
    @Column( name = "HZDJTSHDYXXS2")
    private String HZDJTSHDYXXS2;

    // 肇祸
    @Column( name = "HZDJTSHDYXXS3")
    private String HZDJTSHDYXXS3;

    // 自伤
    @Column( name = "HZDJTSHDYXXS4")
    private String HZDJTSHDYXXS4;

    // 自杀未遂
    @Column( name = "HZDJTSHDYXXS5")
    private String HZDJTSHDYXXS5;

    // 其他危害他人行为
    @Column( name = "HZDJTSHDYXXS7")
    private String HZDJTSHDYXXS7;

    // 危害行为发生日期
    @Column( name = "ZSZHFSRQ")
    private String ZSZHFSRQ;

    // 是否应急医疗处置
    @Column( name = "SFJXYJCZ")
    private String SFJXYJCZ;

    // 是否已转诊
    @Column( name = "SFZZ")
    private String SFZZ;

    // 转诊至机构及科室
    @Column( name = "ZZZJGJKS")
    private String ZZZJGJKS;

    // 转诊原因
    @Column( name = "ZZYY")
    private String ZZYY;

    // 其他描述
    @Column( name = "ZZZJGJKSXS")
    private String ZZZJGJKSXS;

    // 用药情况
    @Column( name = "YYQK")
    private String YYQK;

    // 用药情况用药
    @Column( name = "YWMCHJL")
    private String YWMCHJL;

    // 用药依从性
    @Column( name = "FYYCX")
    private String FYYCX;

    // 治疗效果
    @Column( name = "ZLXG")
    private String ZLXG;

    // 是否接受服药医疗救助
    @Column( name = "SFJSYLJZ")
    private String SFJSYLJZ;

    // 有无严重药物不良反应
    @Column( name = "SFCZYWBLFY")
    private String SFCZYWBLFY;

    // 药物不良反应内容
    @Column( name = "YWBLFY")
    private String YWBLFY;

    // 其他严重药物不良反应
    @Column( name = "QTYZYWBLFY")
    private String QTYZYWBLFY;

    // 实验室检查
    @Column( name = "SYSJC")
    private String SYSJC;

    // 用药指导
    @Column( name = "YYZD")
    private String YYZD;

    // 用药指导用药
    @Column( name = "YYZDYY")
    private String YYZDYY;

    // 个人生活料理
    @Column( name = "GRSHLL")
    private String GRSHLL;

    // 家务劳动
    @Column( name = "JWLD")
    private String JWLD;

    // 生产劳动及工作
    @Column( name = "SCLDJGZ")
    private String SCLDJGZ;

    // 学习能力
    @Column( name = "XXNL")
    private String XXNL;

    // 社会人际交往
    @Column( name = "SHRJJW")
    private String SHRJJW;

    // 康复措施
    @Column( name = "KFCS")
    private String KFCS;

    // 康复措施其他
    @Column( name = "KFCSXS")
    private String KFCSXS;

    // 康复地点
    @Column( name = "KFDD")
    private String KFDD;

    // 康复地点其他地点
    @Column( name = "KFDDXS")
    private String KFDDXS;

    // 康复措施是否落实
    @Column( name = "KFCSSFLS")
    private String KFCSSFLS;

    // 是否进行个案管理
    @Column( name = "SFJXGAGL")
    private String SFJXGAGL;

    // 个案管理病情总体评估
    @Column( name = "GAGLFJ")
    private String GAGLFJ;

    // 个案管理社会功能总评
    @Column( name = "ZTPJ")
    private String ZTPJ;

    // 本次随访分类
    @Column( name = "BCSFFL")
    private String BCSFFL;

    // 下次随访方式
    @Column( name = "XCSFFS")
    private String XCSFFS;

    // 下次随访日期
    @Column( name = "XCSFSJ")
    private String XCSFSJ;

    // 随访医生签名ID
    @Column( name = "SFYS")
    private String SFYS;

    // 随访医生签名
    @Column( name = "SFYSXM")
    private String SFYSXM;

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

    // 是否建议转诊
    @Column( name = "SFJYZZ")
    private String SFJYZZ;

    // 需转诊原因
    @Column( name = "XZZYY")
    private String XZZYY;

    // 是否有3个月内医生开具的精神科药物处方（含患者或家属自行就诊时获得的处方）？
    @Column( name = "SFYYWCF")
    private String SFYYWCF;
}
