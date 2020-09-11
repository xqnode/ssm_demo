package com.example.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {


    //统一异常处理@ExceptionHandler,主要用于Exception
    @ExceptionHandler(Exception.class)
    public String error(Exception e) {
        System.out.println("程序异常");
        return "程序异常";
    }

}
