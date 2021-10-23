package com.baidu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

    public static SqlSession getSqlSession(){

        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            return sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
