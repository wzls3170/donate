package com.example.donate.mapper;

import com.example.donate.bean.Hospital;

import java.util.List;

public interface HospitalMapper {
    int deleteByPrimaryKey(String hid);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(String hid);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);

    List<Hospital> showList();
}