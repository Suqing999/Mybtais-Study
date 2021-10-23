package com.baidu.dao;



import com.baidu.pojo.Role;

import java.sql.Connection;
import java.util.List;

public interface RoleMapper {

    /**
     * 获取角色列表
     * @return
     * @throws Exception
     */
    List<Role> getRoleList() throws Exception;

    //角色的其他操作与其余Mapper操作的重复 略
}
