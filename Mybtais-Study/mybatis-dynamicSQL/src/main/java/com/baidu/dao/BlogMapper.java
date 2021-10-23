package com.baidu.dao;

import com.baidu.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //插入数据
    @Insert("insert into blog values(#{id},#{title},#{author},#{createTime},#{views})")
    int addBlog(Blog blog);

    void updateBlog(Map<String,Object> map);


    //查询博客(根据名字)
    List<Blog> selectBlogIF(Map<String,Object> map);

    List<Blog> selectBlogChoose(Map<String,Object> map);


    List<Blog> selectBlogForeach(Map<String,Object> map);
}
