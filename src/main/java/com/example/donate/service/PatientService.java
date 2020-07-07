package com.example.donate.service;

import com.example.donate.bean.Patient;

import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/13 18:12
 */
public interface PatientService {

    int deleteByPrimaryKey(String pid);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    List<Patient> showList();
}
