package com.yej.ssm.controller;


import com.yej.ssm.pojo.Product;
import com.yej.ssm.pojo.User;
import com.yej.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("listUsers")
    public ModelAndView listUsers(User user, HttpSession session){
        ModelAndView modelAndView = new ModelAndView("listUsers");
        User user1 = new User();
        String username = (String) session.getAttribute("username");
        user1.setName(username);
        System.out.println(username);
        List<User> users = userService.list(user1);
        modelAndView.addObject("users",users);
        return modelAndView;
    }

    @RequestMapping("deleteUser")
    public String deleteUser(int id){
        User user = userService.queryUserById(id);
        user.setDel(1);
        userService.updateUser(user);
        return "redirect:/listUsers";
    }

    @RequestMapping("editUser")
    public ModelAndView editUser(int id){
        User user = userService.queryUserById(id);
        ModelAndView modelAndView = new ModelAndView("editUser");
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    @RequestMapping("updateUser")
    public String updateUser(User user){
        user.setDel(0);
        userService.updateUser(user);
        return "redirect:/listUsers";
    }

    @RequestMapping("addUser")
    public String addUser(User user){
        user.setDel(0);
        userService.addUser(user);
        return "redirect:/listUsers";
    }

    @RequestMapping("searchUser")
    public ModelAndView search(String name, HttpSession session){
        ModelAndView modelAndView = new ModelAndView("listUsers");
        List<User> users = userService.search(name);
        modelAndView.addObject("users",users);
        return modelAndView;
    }

}
