package com.qf.snow.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.TProduct;
import com.qf.snow.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("hh")
public class ProductController {

    @Reference
    private IProductService productService;

    @RequestMapping("tt")
    public String show(){

        List<TProduct> tProducts = productService.selectAll();
        for (TProduct tProduct : tProducts) {
            System.out.println(tProduct+"xxx");
        }

        return "ok";
    }
}
