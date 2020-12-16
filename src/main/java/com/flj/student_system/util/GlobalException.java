package com.flj.student_system.util;

import com.flj.student_system.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {

    /*
     * 对ChangeException异常的处理
     * */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Result handlerSellerException(MyException e) {
        return Result.returnFailWithMessage("出错了，"+e.getMessage());
    }


}
