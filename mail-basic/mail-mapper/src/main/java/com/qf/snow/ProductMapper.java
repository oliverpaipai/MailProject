package com.qf.snow;

import com.qf.base.IBaseDao;
import com.qf.entity.TProduct;

import java.util.List;

public interface ProductMapper {
    List<TProduct> selectAll();
}
