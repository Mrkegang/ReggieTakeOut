package com.kg.reggie.common;

/**
 * @ClassName CustomException
 * @Author kg
 * @Description 自定义业务异常类
 * @Date 2022/8/5 11:41
 * @Version 1.0
 */
public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }
}
