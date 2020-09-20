package com.account.back.Util;


import java.io.Serializable;

public class ServerResponse implements Serializable {
    private Integer code;
    private String message;
    private Object data;

//constructor
    public ServerResponse(){}
    public ServerResponse(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public ServerResponse(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
//getter and setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    //添加成功
    public static ServerResponse addSuccess(){
        return   new ServerResponse(ResponseConstant.SUCCESS_CODE,ResponseConstant.ADD_SUCCESS);
    }
    //添加失败
    public static ServerResponse addFail(){
        return   new ServerResponse(ResponseConstant.FAIL_CODE,ResponseConstant.ADD_FAIL);
    }
    //修改成功
    public static ServerResponse updateSuccess(){
        return   new ServerResponse(ResponseConstant.SUCCESS_CODE,ResponseConstant.UPDATE_SUCCESS);
    }
    //修改失败
    public static ServerResponse updateFail(){
        return   new ServerResponse(ResponseConstant.FAIL_CODE,ResponseConstant.UPDATE_FAIL);
    }
    //删除成功
    public static ServerResponse deleteSuccess(){
        return   new ServerResponse(ResponseConstant.SUCCESS_CODE,ResponseConstant.DELETE_SUCCESS);
    }
    //删除失败
    public static ServerResponse deleteFail(){
        return   new ServerResponse(ResponseConstant.FAIL_CODE,ResponseConstant.DELETE_FAIL);
    }
    //查询成功
    public static ServerResponse getSuccess(Object data){
        return   new ServerResponse(ResponseConstant.SUCCESS_CODE,ResponseConstant.GET_SUCCESS,data);
    }
    //查询失败
    public static ServerResponse getFail(Object data){
        return   new ServerResponse(ResponseConstant.FAIL_CODE,ResponseConstant.GET_FAIL,data);
    }
}
