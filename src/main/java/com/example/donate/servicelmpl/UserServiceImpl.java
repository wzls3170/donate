package com.example.donate.servicelmpl;

import com.example.donate.bean.User;
import com.example.donate.mapper.UserMapper;
import com.example.donate.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Frost
 * @Date: 2020/5/13 0:53
 */

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User login(String uid, String upsw) {
        return userMapper.login(uid,upsw);
    }
}
