package com.qf.snow.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.TProduct;
import com.qf.snow.IProductService;
import com.qf.snow.ProductMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("hh")
public class ProductController {

    @Reference
    private IProductService dao;

    @RequestMapping("tt")
    @ResponseBody
    public List<TProduct> show(){

        return dao.selectAll();


    }
}
