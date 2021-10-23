package com.baidu.dao;

import com.baidu.pojo.User;
import com.baidu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.searchUserById(1);
        System.out.println(user);

        //手动清理 一级缓存默认开启，不能关闭，可以清理
        sqlSession.clearCache();

        System.out.println("++++++++++++++++++++++");
        User user2 = mapper.searchUserById(1);
        System.out.println(user2);
        System.out.println("++++++++++++++++++++++");
        System.out.println(user==user2);
        sqlSession.close();
    }


    @Test
    public void test2(){
        //测试2级缓存

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);


        User user = mapper.searchUserById(1);
        System.out.println(user);
        sqlSession.close(); //结束丢到2级

        System.out.println("++++++++++++++++++++++");

        User user2 = mapper2.searchUserById(1);
        System.out.println(user2);

        System.out.println("++++++++++++++++++++++");

        System.out.println(user==user2);

        sqlSession2.close();

    }

}
