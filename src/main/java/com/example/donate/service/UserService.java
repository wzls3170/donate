package com.example.donate.service;

import com.example.donate.bean.User;

/**
 * @Author: Frost
 * @Date: 2020/5/13 0:52
 */
public interface UserService {
    User login(String uid, String upsw);
}
