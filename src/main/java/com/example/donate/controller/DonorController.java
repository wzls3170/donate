package com.example.donate.controller;

import com.example.donate.bean.Donor;
import com.example.donate.bean.Hospital;
import com.example.donate.service.DonorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Frost
 * @Date: 2020/5/15 15:13
 */
@Controller
public class DonorController {

    @Resource
    DonorService donorService;
    //显示所有
    @GetMapping("/donors")
    public String showList(Model model) {
        List<Donor> donors = donorService.showList();
        model.addAttribute("donors",donors);
        return "info/donor/list";
    }

    //到添加页面
    @GetMapping("/donor")
    public String toAddPage() {
        //来到添加页面
        return "info/donor/add";
    }

    //添加
    @PostMapping("/donor")
    public String add(Donor donor){
        donorService.insertSelective(donor);
        return "redirect:/donors";

    }
    //来到修改页面
    @GetMapping("/donor/{did}")
    public String toEditPage(@PathVariable("did") String did, Model model){
        Donor donor = donorService.selectByPrimaryKey(did);
        model.addAttribute("donor",donor);
        //回到修改页面
        return "info/donor/add";
    }
    //修改，需要提交id
    @PutMapping("/donor")
    public String update(Donor donor){
        donorService.updateByPrimaryKeySelective(donor);
        return "redirect:/donors";
    }
    //删除
    @DeleteMapping("/donor/{did}")
    public String delete(@PathVariable("did") String did){
        donorService.deleteByPrimaryKey(did);
        return "redirect:/donors";

    }
}
