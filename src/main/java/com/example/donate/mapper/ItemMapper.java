package com.example.donate.mapper;

import com.example.donate.bean.Item;

import java.util.List;

public interface ItemMapper {
    int deleteByPrimaryKey(String iid);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(String iid);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    List<Item> showList();

    List<Item> passList();

    List<Item> nopassList();

    int updateimoney();
}