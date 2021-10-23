package com.baidu.dao;

import com.baidu.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(Integer id);

    int addUser(User user);
}
