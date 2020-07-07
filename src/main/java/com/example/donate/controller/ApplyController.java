package com.example.donate.controller;

import com.example.donate.bean.Apply;
import com.example.donate.bean.Hospital;
import com.example.donate.bean.Patient;
import com.example.donate.service.ApplyService;
import com.example.donate.service.HospitalService;
import com.example.donate.service.PatientService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/13 21:29
 */

@Controller
public class ApplyController {

    @Resource
    ApplyService applyService;

    @Resource
    PatientService patientService;

    @Resource
    HospitalService hospitalService;

    //显示所有
    @GetMapping("/applies")
    public String showList(Model model) {
        List<Apply> applies = applyService.showList();
        model.addAttribute("applies",applies);
        return "ask/apply/list";
    }

    //到添加页面
    @GetMapping("/apply")
    public String toAddPage(Model model) {
        //来到添加页面
        List<Patient> patients = patientService.showList();
        List<Hospital> hospitals = hospitalService.showList();
        model.addAttribute("patients",patients);
        model.addAttribute("hospitals",hospitals);
        return "ask/apply/add";
    }

    //添加
    @PostMapping("/apply")
    public String add(Apply apply) {
        System.out.println("添加");
        applyService.insertSelective(apply);
        return "redirect:/applies";

    }
    //来到修改页面
    @GetMapping("/apply/{aid}")
    public String toEditPage(@PathVariable("aid") String aid, Model model){
        Apply apply = applyService.selectByPrimaryKey(aid);
        model.addAttribute("apply",apply);
        List<Patient> patients = patientService.showList();
        model.addAttribute("patients",patients);
        List<Hospital> hospitals = hospitalService.showList();
        model.addAttribute("hospitals",hospitals);
        //回到修改页面
        return "ask/apply/add";
    }
    //修改，需要提交id
    @PutMapping("/apply")
    public String update(Apply apply){
        applyService.updateByPrimaryKeySelective(apply);
        return "redirect:/applies";
    }
    //删除
    @DeleteMapping("/apply/{aid}")
    public String delete(@PathVariable("aid")  String aid){
        applyService.deleteByPrimaryKey(aid);
        return "redirect:/applies";

    }


}
