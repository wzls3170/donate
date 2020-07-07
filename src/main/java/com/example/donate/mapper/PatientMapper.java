package com.example.donate.mapper;

import com.example.donate.bean.Patient;

import java.util.List;

public interface PatientMapper {
    int deleteByPrimaryKey(String pid);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    List<Patient> showList();
}