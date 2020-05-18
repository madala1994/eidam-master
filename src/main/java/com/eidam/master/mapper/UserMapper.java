package com.eidam.master.mapper;

import com.eidam.master.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
@Component(value = "userMapper")
public interface UserMapper extends BaseMapper<User> {

    List<User> findByUserName(String userName);

}
