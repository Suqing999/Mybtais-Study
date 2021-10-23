package com.baidu.dao;

import com.baidu.pojo.User;
import com.baidu.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sun.java2d.pipe.SpanIterator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        System.out.println(userList);
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void test3(){
        User user = new User(7, "张三7", "123");

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(user);
        System.out.println(res);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test4(){
        Integer start = 0;
        Integer pageSize = 2;

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        while (start<=7){
            Map<String,Object> map = new HashMap<>();
            System.out.println(start+"  "+pageSize);
            map.put("start", start);
            map.put("pageSize",pageSize);
            List<User> list = mapper.getUserListByLimit(map);
            System.out.println(list);
            start+=pageSize;
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test5(){
        RowBounds rowBounds = new RowBounds(0, 2);

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<User> userlist = sqlSession.selectList("com.baidu.dao.UserMapper.getUserListByRowBounds",null,rowBounds);
        for (User user : userlist) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
