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
 * @Description 医务人员代码
 * @return
 * @date 2020/12/15 15:00
 */
@Data
@Table(name = "BD0007")
@NameStyle(Style.uppercase)
public class Bd0007 {

    // 人员编码
    @Id
    @Column( name = "RYBM")
    private String RYBM;

    // 工号
    @Column( name = "GH")
    private String GH;

    // 姓名
    @Column( name = "XM")
    private String XM;

    // 身份证号
    @Column( name = "SFZH")
    private String SFZH;

    // 性别
    @Column( name = "XB")
    private String XB;

    // 出生日期
    @Column( name = "CSRQ")
    private String CSRQ;

    // 职务
    @Column( name = "ZW")
    private String ZW;

    // 联系电话
    @Column( name = "LXDH")
    private String LXDH;

    // 电子邮件
    @Column( name = "DZYJ")
    private String DZYJ;

    // 输入方式
    @Column( name = "SRFS")
    private String SRFS;

    // 拼音码
    @Column( name = "PYM")
    private String PYM;

    // 五笔码
    @Column( name = "WBM")
    private String WBM;

    // 输入码
    @Column( name = "SRM")
    private String SRM;

    // 所在机构代码
    @Column( name = "YSSZJGDM")
    private String YSSZJGDM;

    // 修改时间
    @Column( name = "XGSJ")
    private String XGSJ;

    // 作废标识
    @Column( name = "ZFBZ")
    private String ZFBZ;

    // 通讯地址
    @Column( name = "TXDZ")
    private String TXDZ;

    // 部门
    @Column( name = "BM")
    private String BM;

    // 座机号码
    @Column( name = "ZJHM")
    private String ZJHM;

    // 用户类型
    @Column( name = "YHLX")
    private String YHLX;

    // 用户角色（精神病国家）
    @Column( name = "YHJS")
    private String YHJS;
}
