package com.qf.snow;

import com.qf.base.IBaseDao;
import com.qf.entity.TProduct;

import java.util.List;

public interface ProductMapper extends IBaseDao<TProduct> {
    List<TProduct> selectAll();
}
