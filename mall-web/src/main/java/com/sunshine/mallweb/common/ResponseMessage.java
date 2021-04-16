package com.sunshine.mallweb.common;

import java.io.Serializable;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName ResponseMessage.java
 * @Description TODO
 * @createTime 2020年10月06日 19:34:00
 */
public class ResponseMessage<T> implements Serializable {

    public static final String SUCCESS_MSG="请求成功！";
    public static final Integer SUCCESS_CODE=200;

    public static final String NULL_MSG="请求成功，数据为空!";
    public static final Integer NULL_CODE=444;

    public static final String ERROR_MSG="请求失败!";
    public static final Integer ERROR_CODE=404;

    private Integer code;
    private T body;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseMessage(Integer code, T body, String msg) {
        this.code = code;
        this.body = body;
        this.msg = msg;
    }

    public ResponseMessage() {
    }
}
