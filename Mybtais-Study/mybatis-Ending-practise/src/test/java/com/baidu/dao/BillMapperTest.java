package com.baidu.dao;

import com.baidu.pojo.Bill;
import com.baidu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BillMapperTest {
    @Test
    public void test() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);

        Bill b = new Bill();
        b.setProductName("%油%");
        b.setProductDesc("%食品%"); //或者可以在mapper.xml中使用${}进行
        List<Bill> billList = mapper.getBillList(b);

        for (Bill bill : billList) {
            System.out.println(bill);
        }

        sqlSession.close();

    }
}
