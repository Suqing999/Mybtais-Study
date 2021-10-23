package com.baidu.dao;

import com.baidu.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUserList();

    User getUserById(Integer id);

    int addUser(User user);
}
