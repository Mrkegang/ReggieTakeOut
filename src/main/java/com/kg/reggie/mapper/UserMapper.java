package com.kg.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kg.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Author kg
 * @Description TODO
 * @Date 2022/8/11 18:56
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
