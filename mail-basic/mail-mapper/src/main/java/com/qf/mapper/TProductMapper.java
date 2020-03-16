package com.qf.mapper;

import com.qf.base.IBaseDao;
import com.qf.entity.TProduct;

import java.util.List;

public interface TProductMapper extends IBaseDao<TProduct> {
    //查询所有商品
    List<TProduct> findAllProduct();

    TProduct selectByPrimaryKey(Long pid);
}
