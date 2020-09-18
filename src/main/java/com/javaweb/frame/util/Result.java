package com.javaweb.frame.util;
import com.javaweb.frame.exception.ResultExecption;

/**
 * name: RuoFei Xu
 * 2020/8/28 16:45
 */
public class Result {

    private String message;
    private Integer code;
    private Object data;

    public Result(String message, Integer code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public Result(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public Result(Object data) {
        this.message="ok";
        this.code=200;
        this.data = data;
    }

    public Result() {
        this.message="ok";
        this.code=200;
    }

    public static Result ok(ResultEnum resultEnum, Object data){
        return new Result(resultEnum.getMessage(), resultEnum.getCode(),data);
    }

    public static Result ok(Object data){
        return new Result(data);
    }

    public static  Result ok(){
        return new Result();
    }

    public static Result build(ResultExecption resultExecption){
        return new Result(resultExecption.getMessage(), resultExecption.getCode());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
