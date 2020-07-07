package com.example.donate.servicelmpl;

import com.example.donate.bean.Item;
import com.example.donate.mapper.ItemMapper;
import com.example.donate.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/16 0:05
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    ItemMapper itemMapper;

    @Override
    public int deleteByPrimaryKey(String iid) {
        return itemMapper.deleteByPrimaryKey(iid);
    }

    @Override
    public int insert(Item record) {
        return itemMapper.insert(record);
    }

    @Override
    public int insertSelective(Item record) {
        return itemMapper.insertSelective(record);
    }

    @Override
    public Item selectByPrimaryKey(String iid) {
        return itemMapper.selectByPrimaryKey(iid);
    }

    @Override
    public int updateByPrimaryKeySelective(Item record) {
        return itemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Item record) {
        return itemMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Item> showList() {
        return itemMapper.showList();
    }

    @Override
    public List<Item> passList() {
        return itemMapper.passList();
    }

    @Override
    public List<Item> nopassList() {
        return itemMapper.nopassList();
    }

    @Override
    public int updateimoney() {
        return itemMapper.updateimoney();
    }
}
