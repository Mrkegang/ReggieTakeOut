package com.kg.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kg.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName DishMapper
 * @Author kg
 * @Description TODO
 * @Date 2022/8/5 11:15
 * @Version 1.0
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
