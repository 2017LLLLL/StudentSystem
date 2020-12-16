package com.flj.student_system.util;

import com.flj.student_system.enums.ReturnCodeEnum;

/*
    返回结果封装
        code:0表示成功，1表示失败
*/
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /*
    * 返回成功结果，不携带任何数据
    * */
    public static Result returnSuccessWithOutData(){
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(ReturnCodeEnum.RETURN_CODE_SUCCESS.getCode());
        objectResult.setMessage("success");
        objectResult.setData(null);
        return objectResult;
    }

    /*
     * 返回失败结果，不携带任何数据
     * */
    public static Result returnFailWithOutData(){
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(ReturnCodeEnum.RETURN_CODE_FAIL.getCode());
        objectResult.setMessage("fail");
        objectResult.setData(null);
        return objectResult;
    }

    /*
     * 返回成功结果，携带数据
     * */
    public static Result returnSuccessWithData(Object data){
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(ReturnCodeEnum.RETURN_CODE_SUCCESS.getCode());
        objectResult.setMessage("success");
        objectResult.setData(data);
        return objectResult;
    }

    /*
     * 返回失败结果，携带数据
     * */
    public static Result returnFailWithData(Object data){
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(ReturnCodeEnum.RETURN_CODE_FAIL.getCode());
        objectResult.setMessage("success");
        objectResult.setData(data);
        return objectResult;
    }

    /*
     * 返回失败结果，自定义返回信息
     * */
    public static Result returnFailWithMessage(String info){
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(ReturnCodeEnum.RETURN_CODE_FAIL.getCode());
        objectResult.setMessage(info);
        objectResult.setData(null);
        return objectResult;
    }


}
