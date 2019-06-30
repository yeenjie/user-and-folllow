package com.yej.ssm.mapper;

import com.yej.ssm.pojo.Product;
import com.yej.ssm.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> list(User user);
    User findUser(User user);
    public void updateUser(User product);
    public User queryUserById(int id);
    public void addUser(User user);
    List<User> search(String name);
}
