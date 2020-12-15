package com.neusoft.hz.model;

import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Table;

@Data
@Table(name = "COM_EXTERNAL_INVOKE_LOG")
@NameStyle(Style.uppercase)
public class Js01 {
}
