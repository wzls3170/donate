package com.example.donate.controller;

import com.example.donate.bean.*;
import com.example.donate.service.FeeService;
import com.example.donate.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/18 23:41
 */
@Controller
public class FeeController {

    @Resource
    FeeService feeService;
    @Resource
    ItemService itemService;

    //显示所有
    @GetMapping("/fees")
    public String showList(Model model) {
        List<Fee> fees = feeService.showList();
        model.addAttribute("fees",fees);
        return "ask/fee/list";
    }
    //到添加页面
    @GetMapping("/fee")
    public String toAddPage(Model model) {
        //来到添加页面
        List<Item> items = itemService.passList();
        model.addAttribute("items",items);
        return "ask/fee/add";
    }

    //添加
    @PostMapping("/fee")
    public String add(Fee fee) {
        System.out.println("添加");
        feeService.insertSelective(fee);
        feeService.updateSmoney();
        return "redirect:/fees";

    }
    //来到修改页面
    @GetMapping("/fee/{fid}")
    public String toEditPage(@PathVariable("fid") String fid, Model model){
        Fee fee = feeService.selectByPrimaryKey(fid);
        model.addAttribute("fee",fee);
        List<Item> items = itemService.passList();
        model.addAttribute("items",items);
        //回到修改页面
        return "ask/fee/add";
    }
    //修改，需要提交id
    @PutMapping("/fee")
    public String update(Fee fee){
        feeService.updateByPrimaryKeySelective(fee);
        feeService.updateSmoney();
        return "redirect:/fees";
    }
    //删除
    @DeleteMapping("/fee/{fid}")
    public String delete(@PathVariable("fid")  String fid){
        feeService.deleteByPrimaryKey(fid);
        return "redirect:/fees";

    }

}
