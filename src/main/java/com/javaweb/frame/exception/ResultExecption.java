package com.javaweb.frame.exception;

import com.javaweb.frame.util.ResultEnum;

/**
 * name: RuoFei Xu
 * 2020/8/28 19:22
 */
public class ResultExecption extends RuntimeException{

    private ResultEnum resultEnum;
    private String message;
    private Integer code;

    public ResultExecption(String message, Integer code){
        this.message = message;
        this.code = code;
    }
    /*获取枚举中的message 和 code*/
    public ResultExecption(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }

    @Override
    public String getMessage() {
        if(resultEnum!=null){
            this.message=resultEnum.getMessage();
        }
        return message;
    }

    public Integer getCode() {
        if(resultEnum!=null){
            this.code = resultEnum.getCode();
        }
        return code;
    }
}
