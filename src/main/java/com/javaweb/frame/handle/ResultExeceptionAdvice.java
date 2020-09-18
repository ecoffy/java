package com.javaweb.frame.handle;

/**
 * Company : BJPowernode
 * Date : 2020/8/31
 * Description :
 */



import com.javaweb.frame.exception.ResultExecption;
import com.javaweb.frame.util.Result;
import com.javaweb.frame.util.ResultEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常统一处理类
 *
 */
@ControllerAdvice
public class ResultExeceptionAdvice {

    /**
     *该方法用来拦截到controller的异常信息，进行统一处理
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handleExceptionAdvice(Exception e){
        ResultExecption resultExecption = null;

        if (e instanceof ResultExecption){
            resultExecption = (ResultExecption)e;
            return Result.build(resultExecption);
        }else {
            return Result.build(new ResultExecption(ResultEnum.UNKNOWN_EXCEPTION));
        }
    }
}
