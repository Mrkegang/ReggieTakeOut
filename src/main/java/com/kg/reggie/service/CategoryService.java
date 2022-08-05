package com.kg.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kg.reggie.entity.Category;

/**
 * @ClassName CategoryService
 * @Author kg
 * @Description TODO
 * @Date 2022/8/4 11:21
 * @Version 1.0
 */
public interface CategoryService extends IService<Category> {

    public void remove(Long id);
}
