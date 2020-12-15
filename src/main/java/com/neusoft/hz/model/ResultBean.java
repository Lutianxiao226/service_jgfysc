package com.neusoft.hz.model;

import com.neusoft.hz.comp.hsbservice.common.annotation.ReturnType;

public class ResultBean {

    @ReturnType(value = "0")
    private String ReturnMessage;

    public String getReturnMessage() { return ReturnMessage; }

    public void setReturnMessage(String returnMessage) { ReturnMessage = returnMessage; }
}
