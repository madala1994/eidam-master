package com.eidam.master;

import com.eidam.master.entity.User;
import com.eidam.master.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
class MasterApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;

    @Test
    void contextLoads() {
//        List<User> eidam = userMapper.findByUserName("eidam");
        User user = new User();
        user.setId("1");
        user.setUserName("test1");
        user.setPassword("123456");
//        userMapper.insert(user);
//        User user1 = userMapper.selectByPrimaryKey(user);
//        PageInfo<User> userPageInfo = new PageInfo<>(userMapper.selectAll());
        redisTemplate.opsForValue().set("test1", user);
        User test1 = (User) redisTemplate.opsForValue().get("test1");
        log.info("success");

    }

}
