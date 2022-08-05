package com.kg.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kg.reggie.entity.Dish;
import com.kg.reggie.mapper.DishMapper;
import com.kg.reggie.service.DishService;
import org.springframework.stereotype.Service;

/**
 * @ClassName DishServiceImpl
 * @Author kg
 * @Description TODO
 * @Date 2022/8/5 11:18
 * @Version 1.0
 */
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
