package com.baidu.dao;



import com.baidu.pojo.Bill;

import java.util.List;


public interface BillMapper {

    //查数量太简单 略



    /**
     * 增加订单
     *
     * @param bill
     * @return
     * @throws Exception
     */
    //int add(Bill bill) throws Exception;  不进行增加操作了 都一样


    /**
     * 通过模糊查询商品名字-getBillList（此题需要查出供应商名字）
     *
     * @param bill
     * @return
     * @throws Exception
     */
    List<Bill> getBillList(Bill bill) throws Exception;

    //订单记录数略


    /**
     * 通过delId删除Bill
     *
     * @param delId
     * @return
     * @throws Exception
     */
    //int deleteBillById(String delId) throws Exception; 不进行删除操作了 都一样


    /**
     * 通过billId获取Bill
     *
     * @param id
     * @return
     * @throws Exception
     */
    //Bill getBillById(String id) throws Exception;  简单查询

    /**
     * 修改订单信息
     *
     * @param bill
     * @return
     * @throws Exception
     */
    //int modify(Bill bill) throws Exception; 不进行修改操作 都一样的

    /**
     * 根据供应商ID查询订单数量
     *
     * @param providerId
     * @return
     * @throws Exception
     */
    //int getBillCountByProviderId(String providerId) throws Exception;  简单查询

}
