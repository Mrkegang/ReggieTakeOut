package com.kg.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kg.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName OrderMapper
 * @Author kg
 * @Description TODO
 * @Date 2022/8/14 16:07
 * @Version 1.0
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
