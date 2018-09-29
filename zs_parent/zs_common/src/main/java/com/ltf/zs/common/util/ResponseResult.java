package com.ltf.zs.common.util;

import com.ltf.zs.common.constant.ResponseStatusConstant;

public class ResponseResult {
    private int status;
    private String msg;
    private Object data;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
    public ResponseResult() {
    }
    public ResponseResult(int status, String msg, Object data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseResult success(Object data){
        return  new ResponseResult(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS,"success",data);
    }
}
