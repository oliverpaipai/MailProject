package com.qf.snow;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.base.BaseServiceImpl;
import com.qf.base.IBaseDao;
import com.qf.entity.TProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service
@Component
public class ProductServiceImpl extends BaseServiceImpl<TProduct> implements IProductService{

    @Autowired
    private ProductMapper dao;

    @Override
    public IBaseDao<TProduct> getBaseDao() {
        return dao;
    }

    @Override
    public List<TProduct> selectAll() {
        return dao.selectAll();
    }
}
