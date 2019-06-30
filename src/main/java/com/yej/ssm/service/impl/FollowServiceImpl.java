package com.yej.ssm.service.impl;

import com.yej.ssm.mapper.FollowMapper;
import com.yej.ssm.pojo.User;
import com.yej.ssm.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowServiceImpl implements FollowService {
    @Autowired
    FollowMapper followMapper;

    @Override
    public List<User> listFollows(int id) {
        return followMapper.listFollows(id);
    }

    @Override
    public void addFollow(int pid, int fid) {
        followMapper.addFollow(pid,fid);
    }

    @Override
    public void unFollow(int pid, int fid) {
        followMapper.deleteFollow(pid,fid);
    }
}
