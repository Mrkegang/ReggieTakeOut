package com.kg.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kg.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName CategoryMapper
 * @Author kg
 * @Description TODO
 * @Date 2022/8/4 11:20
 * @Version 1.0
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
