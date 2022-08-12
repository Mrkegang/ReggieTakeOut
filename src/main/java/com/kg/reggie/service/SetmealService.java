package com.kg.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kg.reggie.dto.SetmealDto;
import com.kg.reggie.entity.Setmeal;

import java.util.List;

/**
 * @ClassName SetmealService
 * @Author kg
 * @Description TODO
 * @Date 2022/8/5 11:17
 * @Version 1.0
 */
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
