package com.baidu.dao;



import com.baidu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 通过userCode获取User
     *
     * @param userCode
     * @return
     * @throws Exception
     */
    User getLoginUser(@Param("userCode") String userCode) throws Exception;

    /**
     * 增加用户信息
     *
     * @param user
     * @return
     * @throws Exception
     */
    int add(User user) throws Exception;

    /**
     * 通过条件查询-userList
     *
     * @param userName
     * @param userRole
     * @return
     * @throws Exception
     */
    List<User> getUserList(@Param("userName") String userName, @Param("userRole") int userRole,
                           @Param("PageNo")  int currentPageNo, @Param("PageSize")int pageSize) throws Exception;

    /**
     * 通过条件查询-用户表记录数
     *
     * @param userName
     * @param userRole
     * @return
     * @throws Exception
     */
    int getUserCount(@Param("userName") String userName,@Param("userRole") int userRole) throws Exception;

    /**
     * 通过userId删除user
     *
     * @return
     * @throws Exception
     */
    int deleteUserById(@Param("delId") Integer delId) throws Exception;

    /**
     * 通过userId获取user
     *
     * @param id
     * @return
     * @throws Exception
     */
    User getUserById(@Param("id") Integer id) throws Exception;

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     * @throws Exception
     */
    int modify(User user) throws Exception;

    /**
     * 修改当前用户密码（同上一题一样)
     *
     * @param id
     * @param pwd
     * @return
     * @throws Exception
     */
    int updatePwd(int id, String pwd) throws Exception;


}
