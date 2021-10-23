package com.baidu.dao;

import com.baidu.pojo.Role;
import com.baidu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class RoleMapperTest {
    /**
     * test(序号)
     * 序号即对应的mapper顺序
     * */

    @Test
    public void test1() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roleList = mapper.getRoleList();
        for (Role role : roleList) {
            System.out.println(role);
        }
        sqlSession.close();
    }
}
