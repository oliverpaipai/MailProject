package com.qf.service.impl.miaobao;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.TProduct;
import com.qf.mapper.miaobao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service
public class ProductServiceImpl implements ProductDao {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<TProduct> findAllProduct() {
        return productDao.findAllProduct();
    }

    @Override
    public TProduct findProductByPid(Long pid) {
        return null;
    }

    @Override
    public int addProduct(TProduct product) {
        return 0;
    }

    @Override
    public int deleteProductByPid(Long pid) {
        return 0;
    }

    @Override
    public int updateProductById(Long pid) {
        return 0;
    }
}
