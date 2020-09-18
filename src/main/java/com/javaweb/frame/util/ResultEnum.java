package com.javaweb.frame.util;

/**
 * name: RuoFei Xu
 * 2020/8/28 19:18
 */
public enum  ResultEnum {

    SUCCESS("OK",200),
    NOT_FOUND("未找到数据",1004),
    FAILED("操作失败",1005),
    USER_ID_LIMITED("IP受限",1005),
    USER_LOCKED("账户被锁定",1005),
    USER_TIMEEXPIRED("账户过期",1005),
    NOT_FOUND_USER("账户未注册",1004),
    ADD_FAILED("数据添加失败",1005),
    DEL_FAILED("数据删除失败",1005),
    UNKNOWN_EXCEPTION("未知异常",1007),
    PARAM_ERROR("参数异常",1007),
    VCODE_ERROR("验证码错误",1007),
    UPDATE_FAILED("数据更新失败",2001),
    OWNER_PARAM_NOT_NULL("所有者参数不能为空",2001),
    NAME_PARAM_NOT_NULL("名称参数不能为空",2001),
    DATE_PARAM_NOT_NULL("日期参数不能为空",2001),
    STAGE_PARAM_NOT_NULL("阶段参数不能为空",2001),
    CUSTOMER_PARAM_NOT_NULL("客户参数不能为空",2001);

    ResultEnum(String message,Integer code){
        this.message = message;
        this.code = code;
    }

    private String message;
    private Integer code;

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
