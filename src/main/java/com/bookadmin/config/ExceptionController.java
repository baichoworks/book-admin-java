package com.bookadmin.config;

import com.bookadmin.util.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.ServletException;

@RestController
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    public Result exceptionHandle(Exception e) {
        if(e instanceof NoHandlerFoundException)  //404
            return Result.getInstance()
                    .setCode(404)
                    .setSuccess(false);
        else if (e instanceof ServletException)  //其他的Servlet异常就返回400状态码
            return Result.getInstance()
                    .setSuccess(false)
                    .setCode(400)
                    .setMessage("操作失败");
        else
            return Result.getInstance()
                    .setSuccess(false)
                    .setCode(500)
                    .setMessage("操作失败");  //其他异常直接返回500
    }
}
