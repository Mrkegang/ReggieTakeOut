package com.kg.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kg.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName AddressBookMapper
 * @Author kg
 * @Description TODO
 * @Date 2022/8/13 9:19
 * @Version 1.0
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
