package com.example.donate;




import com.example.donate.bean.User;
import com.example.donate.mapper.UserMapper;
import com.example.donate.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @Description：
 * @Author:
 * @Date: 2020/3/28 1:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTest {

    @Resource
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        User user = userMapper.login("admin","555");
        System.out.println(user.getUid());
        //userMapper.insert(user);
        //userMapper.deleteByPrimaryKey("222");

        //userMapper.updateByPrimaryKey(user);
    }

}