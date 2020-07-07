package com.example.donate.controller;



import com.example.donate.bean.User;
import com.example.donate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/")
    public String view(){
        return "login";
    }


    @PostMapping(value = "/user/login") //PostMapping处理POST请求,和下面那个意思一样
    //带上 “/” 是绝对路径，不带  “/” 是相对路径。
    //@RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(@RequestParam("uid") String uid, //用RequestParam标注属性，一旦没提交会报错
                        @RequestParam("upsw") String upsw,
                        Map<String,Object> map, HttpSession session){
        User user = userService.login(uid, upsw);
        if(user !=null){
            //登陆成功
            session.setAttribute("loginUser",uid);
            return "index";
        }else {
            //登陆失败
            map.put("msg","用户名或密码错误");
            return "login";
        }

    }

    /*
    //没有连接数据库，只要用户名不为空，密码为1都可以登陆。
    public String login(@RequestParam("user_id") String user_id, //用RequestParam标注属性，一旦没提交会报错
                        @RequestParam("user_psw") String user_psw,
                        Map<String,Object> map){

        if(!StringUtils.isEmpty(user_id) && "1".equals(user_psw)) {
            //登陆成功
            return "index";
        }else{
            //登陆失败
            map.put("msg","用户名密码错误");
            return "login";
        }
     */

}
