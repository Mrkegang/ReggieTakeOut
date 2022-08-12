package com.kg.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kg.reggie.entity.User;
import com.kg.reggie.mapper.UserMapper;
import com.kg.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Author kg
 * @Description TODO
 * @Date 2022/8/11 18:57
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
