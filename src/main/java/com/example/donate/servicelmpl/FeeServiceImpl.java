package com.example.donate.servicelmpl;

import com.example.donate.bean.Fee;
import com.example.donate.mapper.FeeMapper;
import com.example.donate.service.FeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/18 23:43
 */
@Service
public class FeeServiceImpl implements FeeService {

    @Resource
    FeeMapper feeMapper;

    @Override
    public int deleteByPrimaryKey(String fid) {
        return feeMapper.deleteByPrimaryKey(fid);
    }

    @Override
    public int insert(Fee record) {
        return feeMapper.insert(record);
    }

    @Override
    public int insertSelective(Fee record) {
        return feeMapper.insertSelective(record);
    }

    @Override
    public Fee selectByPrimaryKey(String fid) {
        return feeMapper.selectByPrimaryKey(fid);
    }

    @Override
    public int updateByPrimaryKeySelective(Fee record) {
        return feeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Fee record) {
        return feeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Fee> showList() {
        return feeMapper.showList();
    }

    @Override
    public int updateSmoney() {
        return feeMapper.updateSmoney();
    }
}
