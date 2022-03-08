package com.chinasofti.util;

/**
 *  统一封装结果类
 */

public class ResultModel {
    //返回状态码
    private int code;
    //返回的消息
    private String msg;
    //返回的结果集
    private Object data;
    //生成get和set方法
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
