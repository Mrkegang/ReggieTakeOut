package com.kg.reggie.dto;

import com.kg.reggie.entity.Setmeal;
import com.kg.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
