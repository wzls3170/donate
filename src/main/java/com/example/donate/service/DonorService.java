package com.example.donate.service;

import com.example.donate.bean.Donor;

import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/15 15:35
 */
public interface DonorService {

    int deleteByPrimaryKey(String did);

    int insert(Donor record);

    int insertSelective(Donor record);

    Donor selectByPrimaryKey(String did);

    int updateByPrimaryKeySelective(Donor record);

    int updateByPrimaryKey(Donor record);

    List<Donor> showList();

    int updateDsummoney();
}
