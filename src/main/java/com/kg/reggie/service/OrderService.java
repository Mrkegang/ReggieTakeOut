package com.kg.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kg.reggie.entity.Orders;

/**
 * @ClassName OrderService
 * @Author kg
 * @Description TODO
 * @Date 2022/8/14 16:08
 * @Version 1.0
 */
public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
