package com.kg.reggie.common;

/**
 * @ClassName BaseContext
 * @Author kg
 * @Description 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 * @Date 2022/8/4 10:45
 * @Version 1.0
 */
public class BaseContext {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
