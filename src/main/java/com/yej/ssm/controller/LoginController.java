package com.yej.ssm.controller;


import com.yej.ssm.pojo.User;
import com.yej.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("login")
    public String login(User user, HttpSession session){
        User user1 = userService.findUser(user);
        if(user1 == null){
            return "User name and password do not match";
        }else{
            session.setAttribute("username",user.getName());
            session.setAttribute("userid",user1.getId());
            return "Success";
        }
    }
}
