package com.example.donate.mapper;

import com.example.donate.bean.Apply;
import com.example.donate.bean.Donor;

import java.util.List;

public interface DonorMapper {
    int deleteByPrimaryKey(String did);

    int insert(Donor record);

    int insertSelective(Donor record);

    Donor selectByPrimaryKey(String did);

    int updateByPrimaryKeySelective(Donor record);

    int updateByPrimaryKey(Donor record);

    List<Donor> showList();

    int updateDsummoney();
}