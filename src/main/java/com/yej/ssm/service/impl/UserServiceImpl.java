package com.yej.ssm.service.impl;

import com.yej.ssm.mapper.UserMapper;
import com.yej.ssm.pojo.User;
import com.yej.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> list(User user) {
        return userMapper.list(user);
    }

    @Override
    public List<User> search(String name) {
        return userMapper.search(name);
    }

    @Override
    public User findUser(User user) {

        return userMapper.findUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
