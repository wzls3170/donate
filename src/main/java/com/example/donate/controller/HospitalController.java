package com.example.donate.controller;

import com.example.donate.bean.Hospital;
import com.example.donate.service.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/15 13:44
 */

@Controller
public class HospitalController {

    @Resource
    HospitalService hospitalService;

    //显示所有
    @GetMapping("/hospitals")
    public String showList(Model model) {
        List<Hospital> hospitals = hospitalService.showList();
        model.addAttribute("hospitals",hospitals);
        return "info/hospital/list";
    }

    //到添加页面
    @GetMapping("/hospital")
    public String toAddPage() {
        //来到添加页面
        return "info/hospital/add";
    }

    //添加
    @PostMapping("/hospital")
    public String add(Hospital hospital){
        hospitalService.insertSelective(hospital);
        return "redirect:/hospitals";

    }
    //来到修改页面
    @GetMapping("/hospital/{hid}")
    public String toEditPage(@PathVariable("hid") String hid, Model model){
        Hospital hospital = hospitalService.selectByPrimaryKey(hid);
        model.addAttribute("hospital",hospital);
        //回到修改页面
        return "info/hospital/add";
    }
    //修改，需要提交id
    @PutMapping("/hospital")
    public String update(Hospital hospital){
        hospitalService.updateByPrimaryKeySelective(hospital);
        return "redirect:/hospitals";
    }
    //删除
    @DeleteMapping("/hospital/{hid}")
    public String delete(@PathVariable("hid") String hid){
        hospitalService.deleteByPrimaryKey(hid);
        return "redirect:/hospitals";

    }



}
