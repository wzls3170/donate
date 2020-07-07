package com.example.donate.service;

import com.example.donate.bean.Item;

import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/16 0:05
 */
public interface ItemService {

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
