package com.example.donate;



import com.example.donate.bean.Apply;
import com.example.donate.bean.Patient;
import com.example.donate.mapper.ApplyMapper;
import com.example.donate.mapper.PatientMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;


/**
 * @Author: Frost
 * @Date: 2020/4/26 19:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TwoTest {
    @Resource
    PatientMapper patientMapper;
    @Resource
    ApplyMapper applyMapper;

    @Test
    public void test2(){
        List<Patient> patients = patientMapper.showList();
        System.out.println(patients);
        List<Apply> applies =  applyMapper.showList();
        System.out.println(applies);
        System.out.println(applies.get(0).getAddl());
        System.out.println(applies.get(0).getHospital().getHid());
    }

}

