package com.example.donate.servicelmpl;

import com.example.donate.bean.Donor;
import com.example.donate.mapper.DonorMapper;
import com.example.donate.service.DonorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/15 15:36
 */
@Service
public class DonorServiceImpl implements DonorService {

    @Resource
    DonorMapper donorMapper;

    @Override
    public int deleteByPrimaryKey(String did) {
        return donorMapper.deleteByPrimaryKey(did);
    }

    @Override
    public int insert(Donor record) {
        return donorMapper.insert(record);
    }

    @Override
    public int insertSelective(Donor record) {
        return donorMapper.insertSelective(record);
    }

    @Override
    public Donor selectByPrimaryKey(String did) {
        return donorMapper.selectByPrimaryKey(did);
    }

    @Override
    public int updateByPrimaryKeySelective(Donor record) {
        return donorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Donor record) {
        return donorMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Donor> showList() {
        return donorMapper.showList();
    }

    @Override
    public int updateDsummoney() {
        return donorMapper.updateDsummoney();
    }
}
