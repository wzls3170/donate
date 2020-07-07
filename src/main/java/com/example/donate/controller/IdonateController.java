package com.example.donate.controller;


import com.example.donate.bean.*;
import com.example.donate.service.DonorService;
import com.example.donate.service.IdonateService;
import com.example.donate.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/19 20:06
 */

@Controller
public class IdonateController {

    @Resource
    IdonateService idonateService;
    @Resource
    DonorService donorService;
    @Resource
    ItemService itemService;

    //显示所有
    @GetMapping("/idonates")
    public String showList(Model model) {
        List<Idonate> idonates= idonateService.showList();
        model.addAttribute("idonates",idonates);
        return "idonate/list";
    }

    //到添加页面
    @GetMapping("/idonate")
    public String toAddPage(Model model) {
        //来到添加页面
        List<Donor> donors = donorService.showList();
        List<Item> items = itemService.nopassList();
        model.addAttribute("donors",donors);
        model.addAttribute("items",items);
        return "idonate/add";
    }

    //添加
    @PostMapping("/idonate")
    public String add(Idonate idonate) {
        System.out.println("添加");
        idonateService.insertSelective(idonate);
        itemService.updateimoney();
        donorService.updateDsummoney();
        return "redirect:/idonates";

    }
    //来到修改页面
    @GetMapping("/idonate/{idoid}")
    public String toEditPage(@PathVariable("idoid") Integer idoid, Model model){
        Idonate idonate = idonateService.selectByPrimaryKey(idoid);
        model.addAttribute("idonate",idonate);
        List<Donor> donors = donorService.showList();
        List<Item> items = itemService.nopassList();
        model.addAttribute("donors",donors);
        model.addAttribute("items",items);
        //回到修改页面
        return "idonate/add";
    }
    //修改，需要提交id
    @PutMapping("/idonate")
    public String update(Idonate idonate){
        System.out.println("修改");
        idonateService.updateByPrimaryKeySelective(idonate);
        itemService.updateimoney();
        donorService.updateDsummoney();
        return "redirect:/idonates";
    }
    //删除
    @DeleteMapping("/idonate/{idoid}")
    public String delete(@PathVariable("idoid")  Integer idoid){
        idonateService.deleteByPrimaryKey(idoid);
        return "redirect:/idonates";

    }

}
