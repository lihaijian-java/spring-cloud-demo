package com.javaboy.sleuth;

/**
 * ResultBean
 *
 * @author haijian.li
 * @version 1.0
 * 2020/12/14 10:59
 **/
public class ResultBean {
    private boolean success;
    private Integer code;
    private String msg;
    private Object data;

    public ResultBean(boolean success, Integer code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultBean() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
