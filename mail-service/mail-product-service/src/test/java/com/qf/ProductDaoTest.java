package com.qf;

import com.qf.entity.TProduct;
import com.qf.mapper.miaobao.ProductDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductDaoTest {

    @Autowired
    private ProductDao productDao;

    @Test
    public void findAllProduct() {

        List<TProduct> allProduct = productDao.findAllProduct();
        for (TProduct tProduct : allProduct) {
            System.out.println(tProduct);
        }
    }

    @Test
    public void findProductByPid() {
    }

    @Test
    public void addProduct() {
    }

    @Test
    public void deleteProductByPid() {
    }

    @Test
    public void updateProductById() {
    }
}