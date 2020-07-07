package com.example.donate.service;

import com.example.donate.bean.Fee;

import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/18 23:43
 */
public interface FeeService {

    int deleteByPrimaryKey(String fid);

    int insert(Fee record);

    int insertSelective(Fee record);

    Fee selectByPrimaryKey(String fid);

    int updateByPrimaryKeySelective(Fee record);

    int updateByPrimaryKey(Fee record);

    List<Fee> showList();

    int updateSmoney();
}
