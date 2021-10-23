package com.baidu.dao;

import com.baidu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User searchUserById(@Param("id") Integer id);

}
