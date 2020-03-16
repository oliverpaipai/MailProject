package com.qf.mapper;

import com.qf.base.IBaseDao;
import com.qf.entity.TProductDesc;

import java.util.Map;

public interface TProductDescMapper extends IBaseDao<TProductDesc> {

    //通过物品pid查询物品详细信息
    TProductDesc selectByPid(Long pid);

    int updateDescPid(Map map);

    int deleteDescPid(Long pid);

    TProductDesc selectByPrimaryKey(Long pid);

}
