package com.yej.ssm.service;

import com.yej.ssm.pojo.Product;
import com.yej.ssm.pojo.User;

import java.util.List;

public interface UserService {
    List<User> list(User user);
    List<User> search(String name);
    User findUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);
    public User queryUserById(int id);
    public void addUser(User user);

}
