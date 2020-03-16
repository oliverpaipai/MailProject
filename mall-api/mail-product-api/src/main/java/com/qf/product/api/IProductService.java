package com.qf.product.api;

import com.qf.base.IBaseService;
import com.qf.dto.ResultBean;
import com.qf.dto.TProductAddDTO;
import com.qf.entity.TProduct;

import java.util.List;

public interface IProductService{

    //查询所有商品
    List<TProduct> findAllProduct();

    //通过主键id查询商品详情
    ResultBean selectTProductInfo(Long pid);

    //添加商品到数据库
    ResultBean addProduct(TProductAddDTO productAddDTO);

    //删除商品
    ResultBean deleteProductByPid(Long pid);

    //修改商品信息
    ResultBean updateProductById(TProductAddDTO productDTO);
}
