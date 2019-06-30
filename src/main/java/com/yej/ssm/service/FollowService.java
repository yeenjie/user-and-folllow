package com.yej.ssm.service;

import com.yej.ssm.pojo.User;

import java.util.List;

public interface FollowService {
    List<User> listFollows(int id);
    void addFollow(int pid,int fid);
    void unFollow(int pid,int fid);
}
