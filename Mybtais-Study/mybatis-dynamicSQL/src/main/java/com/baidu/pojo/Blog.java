package com.baidu.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime; //与数据库不一致，但是可以通过设置驼峰命名进行
    private int views;
}
