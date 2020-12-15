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
 * @Description 康复及效果综合评价
 * @return
 * @date 2020/12/15 11:00
 */
@Data
@Table(name = "JS05")
@NameStyle(Style.uppercase)
public class Js05 {

    // 记录标识
    @Id
    @Column( name = "ID")
    private String ID;

    // 专项ID
    @Column( name = "ZXID")
    private String ZXID;

    // 服务类型
    @Column( name = "FWLX")
    private String FWLX;

    // 个案管理计划
    @Column( name = "JHZLKFYJ")
    private String JHZLKFYJ;

    // 个案管理措施落实
    @Column( name = "KFCSLS")
    private String KFCSLS;

    // 目前病情
    @Column( name = "MQBQ")
    private String MQBQ;

    // 劳动力
    @Column( name = "KFQKLDL")
    private String KFQKLDL;

    // 病情总体评估（与入组时相比）
    @Column( name = "BQZTPG")
    private String BQZTPG;

    // 现状评估，明确问题
    @Column( name = "XZPGMQWT")
    private String XZPGMQWT;

    // 确定目标，制定指标
    @Column( name = "QDMBZDZB")
    private String QDMBZDZB;

    // 采取措施
    @Column( name = "CQCS")
    private String CQCS;

    // 总体评价
    @Column( name = "ZTPJ")
    private String ZTPJ;

    // 责任人
    @Column( name = "ZRR")
    private String ZRR;

    // 责任是否按时完成
    @Column( name = "ZRSFASWC")
    private String ZRSFASWC;

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
    @Column( name = "JTWDSHHD")
    private String JTWDSHHD;

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
    @Column( name = "SSDSPJF")
    private String SSDSPJF;

    // 学习新知识及技能
    @Column( name = "XXXZSJJN")
    private String XXXZSJJN;

    // 劳动力
    @Column( name = "SHPGLDL")
    private String SHPGLDL;

    // 评估单位机构编号
    @Column( name = "PGDW")
    private String PGDW;

    // 评估单位名称
    @Column( name = "PGDWMC")
    private String PGDWMC;

    // 评估人
    @Column( name = "PGR")
    private String PGR;

    // 评估人姓名
    @Column( name = "PGRMC")
    private String PGRMC;

    // 评估日期
    @Column( name = "PGRQ")
    private String PGRQ;

    // 录入人ID
    @Column( name = "LRR")
    private String LRR;

    // 录入人姓名
    @Column( name = "LRRXM")
    private String LRRXM;

    // 录入日期
    @Column( name = "LRRQ")
    private String LRRQ;

    // 作废标识
    @Column( name = "ZFBZ")
    private String ZFBZ;

}
