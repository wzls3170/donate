package com.example.donate.controller;

import com.example.donate.bean.Patient;
import com.example.donate.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/13 18:11
 */

@Controller
public class PatientController {
    @Resource
    PatientService patientService;

    //显示所有
    @GetMapping("/patients")
    public String showList(Model model) {
        List<Patient> patients = patientService.showList();
        model.addAttribute("patients",patients);
        System.out.println();

        return "info/patient/list";
    }

    //到添加页面
    @GetMapping("/patient")
    public String toAddPage() {
        //来到添加页面
        return "info/patient/add";
    }

    //添加
    @PostMapping("/patient")
    public String add(Patient patient){
        patientService.insertSelective(patient);
        return "redirect:/patients";

    }
    //来到修改页面
    @GetMapping("/patient/{pid}")
    public String toEditPage(@PathVariable("pid") String pid, Model model){
        Patient patient = patientService.selectByPrimaryKey(pid);
        model.addAttribute("patient",patient);
        //回到修改页面
        return "info/patient/add";
    }
    //修改，需要提交id
    @PutMapping("/patient")
    public String update(Patient patient){
        patientService.updateByPrimaryKeySelective(patient);
        return "redirect:/patients";
    }
    //删除
    @DeleteMapping("/patient/{pid}")
    public String delete(@PathVariable("pid") String pid){
       patientService.deleteByPrimaryKey(pid);
        return "redirect:/patients";

    }



}

