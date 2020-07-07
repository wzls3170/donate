package com.example.donate.servicelmpl;

import com.example.donate.bean.Hospital;
import com.example.donate.mapper.HospitalMapper;
import com.example.donate.service.HospitalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/15 13:41
 */
@Service
public class HospitalServiceImpl implements HospitalService {

    @Resource
    HospitalMapper hospitalMapper;

    @Override
    public int deleteByPrimaryKey(String hid) {
        return hospitalMapper.deleteByPrimaryKey(hid);
    }

    @Override
    public int insert(Hospital record) {
        return hospitalMapper.insert(record);
    }

    @Override
    public int insertSelective(Hospital record) {
        return hospitalMapper.insertSelective(record);
    }

    @Override
    public Hospital selectByPrimaryKey(String hid) {
        return hospitalMapper.selectByPrimaryKey(hid);
    }

    @Override
    public int updateByPrimaryKeySelective(Hospital record) {
        return hospitalMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updateByPrimaryKey(Hospital record) {
        return hospitalMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Hospital> showList() {
        return hospitalMapper.showList();
    }
}
