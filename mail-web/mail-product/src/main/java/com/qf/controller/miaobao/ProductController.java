//package com.qf.controller.miaobao;
//
//import com.alibaba.dubbo.config.annotation.Reference;
//import com.qf.entity.TProduct;
//import com.qf.mapper.miaobao.ProductDao;
//import com.qf.service.impl.miaobao.ProductServiceImpl;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("product")
//public class ProductController {
//
//    @Reference
//    private ProductDao productDao;
//
//    @RequestMapping("findAllProduct")
//    @ResponseBody
//    public List<TProduct> findAllProduct(){
//        return productDao.findAllProduct();
//    }
//
//}
