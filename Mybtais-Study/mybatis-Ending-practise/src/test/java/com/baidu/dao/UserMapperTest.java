package com.baidu.dao;

import com.baidu.pojo.User;
import com.baidu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UserMapperTest {


    @Test
    public void test1() throws Exception {
        SqlSession  sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        //仅在此题用resultMap进行操作（1对1的User）

        User user = mapper.getLoginUser("zhanghua");

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void test2() throws Exception {
        //User getLoginUser(String userCode) throws Exception;
        SqlSession  sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "lihua", "李华", "0000000", 1,
                new SimpleDateFormat("yyyy-MM-dd").parse("1999-08-01"), "13500000000", "北京朝阳区朝阳广场", 2,
                1, new Date(), null, null,null);
        int add = mapper.add(user);
        System.out.println(add);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test3() throws Exception {
        SqlSession  sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.getUserList("李明", 2, 0, 2);

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
    @Test
    public void test4() throws Exception {
        SqlSession  sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int count = mapper.getUserCount("李明", 2);

        System.out.println(count);

        sqlSession.close();
    }
    @Test
    public void test5() throws Exception {
        SqlSession  sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int deleteUserById = mapper.deleteUserById(15);

        System.out.println(deleteUserById);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test6() throws Exception {
        SqlSession  sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(10);

        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void test7() throws Exception {
        SqlSession  sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setUserPassword("11111111");
        user.setId(1);
        int modify = mapper.modify(user);

        System.out.println(modify);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test8()throws Exception{
       // 修改当前用户密码（同上一题一样)
    }
}
