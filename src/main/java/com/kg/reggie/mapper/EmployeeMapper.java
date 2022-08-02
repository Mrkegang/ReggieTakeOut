package com.kg.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kg.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName EmployeeMapper
 * @Author kg
 * @Description TODO
 * @Date 2022/8/2 9:35
 * @Version 1.0
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
