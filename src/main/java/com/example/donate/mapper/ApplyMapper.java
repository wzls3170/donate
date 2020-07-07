package com.example.donate.mapper;

import com.example.donate.bean.Apply;

import java.util.List;

public interface ApplyMapper {
    int deleteByPrimaryKey(String aid);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(String aid);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);

    List<Apply> showList();

    List<Apply> passList();
}