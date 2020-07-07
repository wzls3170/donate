package com.example.donate.servicelmpl;

import com.example.donate.bean.Apply;
import com.example.donate.mapper.ApplyMapper;
import com.example.donate.service.ApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/13 21:29
 */
@Service
public class ApplyServiceImpl implements ApplyService {

    @Resource
    ApplyMapper applyMapper;

    @Override
    public int deleteByPrimaryKey(String aid) {
        return applyMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public int insert(Apply record) {
        return applyMapper.insert(record);
    }

    @Override
    public int insertSelective(Apply record) {
        return applyMapper.insertSelective(record);
    }

    @Override
    public Apply selectByPrimaryKey(String aid) {
        return applyMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int updateByPrimaryKeySelective(Apply record) {
        return applyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Apply record) {
        return applyMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Apply> showList() {
        return applyMapper.showList();
    }

    @Override
    public List<Apply> passList() {
        return applyMapper.passList();
    }
}
