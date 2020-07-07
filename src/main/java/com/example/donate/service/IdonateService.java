package com.example.donate.service;

import com.example.donate.bean.Idonate;

import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/19 20:09
 */
public interface IdonateService {
    int deleteByPrimaryKey(Integer idoid);

    int insert(Idonate record);

    int insertSelective(Idonate record);

    Idonate selectByPrimaryKey(Integer idoid);

    int updateByPrimaryKeySelective(Idonate record);

    int updateByPrimaryKey(Idonate record);

    List<Idonate> showList();
}
