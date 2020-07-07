package com.example.donate.service;

import com.example.donate.bean.Apply;

import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/13 21:29
 */
public interface ApplyService {

    int deleteByPrimaryKey(String aid);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(String aid);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);

    List<Apply> showList();

    List<Apply> passList();
}
