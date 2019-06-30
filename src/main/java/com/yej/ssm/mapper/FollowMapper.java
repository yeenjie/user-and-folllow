package com.yej.ssm.mapper;

import com.yej.ssm.pojo.User;

import java.util.List;

public interface FollowMapper {
    List<User>  listFollows(int id);
    void addFollow(int pid,int fid);
    void deleteFollow(int pid,int fid);
}
