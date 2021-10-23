package com.baidu.dao;
import com.baidu.pojo.Provider;

import java.util.List;

public interface ProviderMapper {

    /**
     * 增加供应商
     *
     * @param provider
     * @return
     * @throws Exception
     */
    //int add(Provider provider) throws Exception;  增加操作无意义

    //获取供应商 简单select 略

    //供应商记录数（略） 与其他的题目重复

    /**
     * 通过供应商名称、编码获取供应商列表-模糊查询-providerList （同bill中的模糊查询略）
     *
     * @param proName
     * @return
     * @throws Exception
     */
   // List<Provider> getProviderList(String proName, String proCode) throws Exception;


    /**
     * 通过proId删除Provider
     *
     * @param delId
     * @return
     * @throws Exception
     */
    //int deleteProviderById(String delId) throws Exception;


    /**
     * 通过proId获取Provider
     *
     * @param id
     * @return
     * @throws Exception
     */
    //Provider getProviderById(String id) throws Exception;

    /**
     * 修改信息
     *
     * @param provider
     * @return
     * @throws Exception
     */
    //int modify(Provider provider) throws Exception;


}
