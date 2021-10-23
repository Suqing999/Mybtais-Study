package com.baidu.dao;

import com.baidu.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(Integer id);

    int addUser(User user);

    List<User> getUserListByLimit(Map<String,Object> map);

    List<User> getUserListByRowBounds();
}
