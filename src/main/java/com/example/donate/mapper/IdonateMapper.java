package com.example.donate.mapper;

import com.example.donate.bean.Idonate;

import java.util.List;

public interface IdonateMapper {
    int deleteByPrimaryKey(Integer idoid);

    int insert(Idonate record);

    int insertSelective(Idonate record);

    Idonate selectByPrimaryKey(Integer idoid);

    int updateByPrimaryKeySelective(Idonate record);

    int updateByPrimaryKey(Idonate record);

    List<Idonate> showList();
}