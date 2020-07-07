package com.example.donate.controller;

import com.example.donate.bean.Apply;
import com.example.donate.bean.Hospital;
import com.example.donate.bean.Item;
import com.example.donate.bean.Patient;
import com.example.donate.service.ApplyService;
import com.example.donate.service.HospitalService;
import com.example.donate.service.ItemService;
import com.example.donate.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/16 0:04
 */

@Controller
public class ItemController {

    @Resource
    ItemService itemService;

    @Resource
    ApplyService applyService;

    @Resource
    PatientService patientService;

    @Resource
    HospitalService hospitalService;


    //显示所有
    @GetMapping("/items")
    public String showList(Model model) {
        List<Item> items = itemService.showList();
        model.addAttribute("items",items);
        return "item/list";
    }

    //到添加页面
    @GetMapping("/item")
    public String toAddPage(Model model) {
        //来到添加页面
        List<Apply> applies = applyService.passList();
        model.addAttribute("applies",applies);
        List<Patient> patients = patientService.showList();
        List<Hospital> hospitals = hospitalService.showList();
        model.addAttribute("patients",patients);
        model.addAttribute("hospitals",hospitals);
        return "item/add";
    }

    //添加
    @PostMapping("/item")
    public String add(Item item) throws ParseException {
        System.out.println("添加");
        itemService.insertSelective(item);

        return "redirect:/items";

    }
    //来到修改页面
    @GetMapping("/item/{iid}")
    public String toEditPage(@PathVariable("iid") String iid, Model model){
        Item item = itemService.selectByPrimaryKey(iid);
        List<Apply> applies = applyService.passList();
        model.addAttribute("applies",applies);
        List<Patient> patients = patientService.showList();
        List<Hospital> hospitals = hospitalService.showList();
        model.addAttribute("patients",patients);
        model.addAttribute("hospitals",hospitals);
        model.addAttribute("item",item);
        //回到修改页面
        return "item/add";
    }
    //修改，需要提交id
    @PutMapping("/item")
    public String update(Item item) throws ParseException {
        System.out.println("修改");
        //System.out.println(item.getIddl());
        //SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
        //Date date =  formatter.parse(iddl);
        //item.setIddl(date);
        System.out.println(item.getIddl());
        itemService.updateByPrimaryKeySelective(item);
        return "redirect:/items";
    }
    //删除
    @DeleteMapping("/item/{iid}")
    public String delete(@PathVariable("iid")  String iid){
        itemService.deleteByPrimaryKey(iid);
        return "redirect:/items";

    }
}
