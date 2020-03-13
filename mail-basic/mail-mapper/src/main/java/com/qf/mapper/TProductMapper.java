package com.qf.mapper;

import com.qf.dto.TProductDTO;
import com.qf.entity.TProduct;

import java.util.List;

public interface TProductMapper{
    //查询所有
    List<TProductDTO> findAll();
    //添加商品
    void insertTproduct(TProductDTO TProductDTO);
    //修改商品
    void updateTproduct(TProductDTO TProductDTO);
    //删除商品
    void delTproductById(Integer id);

}
