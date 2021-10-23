package com.baidu.dao;

import com.baidu.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from teacher")
    List<Teacher> getTeacher();


    //获取指定老师所有学生及老师信息
    Teacher getTeacherAndStudent(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
