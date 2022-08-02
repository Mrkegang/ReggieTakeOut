package com.kg.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kg.reggie.entity.Employee;
import com.kg.reggie.mapper.EmployeeMapper;
import com.kg.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @ClassName EmployeeServiceImpl
 * @Author kg
 * @Description TODO
 * @Date 2022/8/2 9:38
 * @Version 1.0
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
