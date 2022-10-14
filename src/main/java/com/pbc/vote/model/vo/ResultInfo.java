package com.pbc.vote.model.vo;


import com.pbc.vote.constant.ResultConstant;

/**
 * @Author: Aaron
 * @Date: 2022/10/13 19:54
 */
public class ResultInfo<T> {

    private Integer code = ResultConstant.SUCCESS_CODE;
    private String msg = ResultConstant.SUCCESS_MSG;
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
