package com.example.donate.servicelmpl;

import com.example.donate.bean.Patient;
import com.example.donate.mapper.PatientMapper;
import com.example.donate.service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/13 18:12
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Resource
    PatientMapper patientMapper;

    @Override
    public List<Patient> showList() {
        return patientMapper.showList();
    }

    @Override
    public int deleteByPrimaryKey(String pid) {
        return patientMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public int insert(Patient record) {
        return patientMapper.insert(record);
    }

    @Override
    public int insertSelective(Patient record) {
        return patientMapper.insertSelective(record);
    }

    @Override
    public Patient selectByPrimaryKey(String pid) {
        return patientMapper.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(Patient record) {
        return patientMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Patient record) {
        return patientMapper.updateByPrimaryKey(record);
    }
}
