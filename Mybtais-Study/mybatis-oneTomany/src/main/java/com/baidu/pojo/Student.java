package com.baidu.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;

    //关联一个老师
    private Teacher teacher;
}
