package com.yej.ssm.controller;

import com.mysql.jdbc.log.Log4JLogger;
import com.yej.ssm.pojo.User;
import com.yej.ssm.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;

import java.util.List;

@Controller
public class FollowController {
    @Autowired
    FollowService followService;

    @RequestMapping("listFollows")
    public ModelAndView listsFollows(int id){
        ModelAndView modelAndView = new ModelAndView("listFollows");
//        System.out.println(id);
        List<User> users = followService.listFollows(id);
        modelAndView.addObject("users",users);
        return  modelAndView;
    }
    @RequestMapping("followUser")
    public String followUser(int pid,int fid){
        followService.addFollow(pid,fid);
        String redirectUrl ="redirect:/listFollows?id="+pid;
        return redirectUrl;
    }

    @RequestMapping("unFollow")
    public String unfollow(int pid,int fid){
        followService.unFollow(pid,fid);
        String redirectUrl ="redirect:/listFollows?id="+pid;
        return redirectUrl;
    }
}
