package com.example.donate.servicelmpl;

import com.example.donate.bean.Idonate;
import com.example.donate.mapper.IdonateMapper;
import com.example.donate.service.IdonateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/19 20:09
 */

@Service
public class IdonateServiceImpl implements IdonateService {

    @Resource
    IdonateMapper idonateMapper;

    @Override
    public int deleteByPrimaryKey(Integer idoid) {
        return idonateMapper.deleteByPrimaryKey(idoid);
    }

    @Override
    public int insert(Idonate record) {
        return idonateMapper.insert(record);
    }

    @Override
    public int insertSelective(Idonate record) {
        return idonateMapper.insertSelective(record);
    }

    @Override
    public Idonate selectByPrimaryKey(Integer idoid) {
        return idonateMapper.selectByPrimaryKey(idoid);
    }

    @Override
    public int updateByPrimaryKeySelective(Idonate record) {
        return idonateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Idonate record) {
        return idonateMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Idonate> showList() {
        return idonateMapper.showList();
    }
}
