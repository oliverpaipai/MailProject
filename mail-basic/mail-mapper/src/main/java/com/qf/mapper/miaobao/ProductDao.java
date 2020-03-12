package com.qf.mapper.miaobao;

import com.qf.entity.TProduct;

import java.util.List;

public interface ProductDao {
    //查询所有商品
    List<TProduct> findAllProduct();

    //通过主键id查询商品
    TProduct findProductByPid(Long pid);

    //添加商品到数据库
    int addProduct(TProduct product);

    //通过主键id删除商品
    int deleteProductByPid(Long pid);

    //通过主键id修改商品信息
    int updateProductById(Long pid);
}
