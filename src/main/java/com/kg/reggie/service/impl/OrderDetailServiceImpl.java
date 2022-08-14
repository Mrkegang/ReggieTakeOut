package com.kg.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kg.reggie.entity.OrderDetail;
import com.kg.reggie.mapper.OrderDetailMapper;
import com.kg.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderDetailServiceImpl
 * @Author kg
 * @Description TODO
 * @Date 2022/8/14 16:10
 * @Version 1.0
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
