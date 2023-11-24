package com.bookadmin.util;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true) // 链式编程
public class Result {

    private int code = 200;
    private boolean success = true;
    private String message;
    private Object data;

    private Result(){

    }

    public static Result getInstance(){
        return new Result();
    }

}