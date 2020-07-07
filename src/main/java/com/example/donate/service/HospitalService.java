package com.example.donate.service;

import com.example.donate.bean.Hospital;
import com.example.donate.bean.Patient;

import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/15 13:41
 */
public interface HospitalService {

    int deleteByPrimaryKey(String hid);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(String hid);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);

    List<Hospital> showList();
}
