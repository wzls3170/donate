package com.example.donate.mapper;

import com.example.donate.bean.Fee;

import java.util.List;

public interface FeeMapper {
    int deleteByPrimaryKey(String fid);

    int insert(Fee record);

    int insertSelective(Fee record);

    Fee selectByPrimaryKey(String fid);

    int updateByPrimaryKeySelective(Fee record);

    int updateByPrimaryKey(Fee record);

    List<Fee> showList();

    int updateSmoney();
}