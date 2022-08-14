package com.kg.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kg.reggie.entity.ShoppingCart;
import com.kg.reggie.mapper.ShoppingCartMapper;
import com.kg.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @ClassName ShoppingCartServiceImpl
 * @Author kg
 * @Description TODO
 * @Date 2022/8/14 14:45
 * @Version 1.0
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
