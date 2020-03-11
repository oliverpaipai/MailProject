package com.qf.snow;

import com.qf.base.IBaseService;
import com.qf.entity.TProduct;

import java.util.List;

public interface IProductService extends IBaseService<TProduct> {

    List<TProduct> selectAll();
}
