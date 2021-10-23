package com.baidu.dao;

import com.baidu.pojo.Blog;
import com.baidu.utils.IDutils;
import com.baidu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MybatisTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setAuthor("wx");
        blog.setCreateTime(new Date());
        blog.setTitle("Mybatis 复习");
        blog.setViews(1024);

        int i = mapper.addBlog(blog);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> map =new HashMap<>();

        //map.put("title", "Mybatis 复习");
        //map.put("author","wx");

        List<Blog> blogs = mapper.selectBlogIF(map);

        System.out.println(blogs);
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> map =new HashMap<>();

        map.put("title", "Mybatis 复习");
        map.put("author","wx");

        List<Blog> blogs = mapper.selectBlogChoose(map);

        System.out.println(blogs);
        sqlSession.close();
    }



    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> map =new HashMap<>();

        //map.put("title", "Mybatis复习");
        //map.put("author","Wx");
        map.put("id","8d39fd84e3c943ab86dd217c7dd08e6f");
        mapper.updateBlog(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> map =new HashMap<>();
        List<String> idList = new ArrayList<>();
        idList.add("8d39fd84e3c943ab86dd217c7dd08e6f");
        idList.add("8d7a9bc4d1ee4a1da7543bffd623ae62");
        map.put("ids", idList);

        List<Blog> blogs = mapper.selectBlogForeach(map);
        System.out.println(blogs);
        sqlSession.close();
    }
}
