package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.dto.ResultBean;
import com.qf.dto.TProductAddDTO;
import com.qf.entity.TProduct;
import com.qf.product.api.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {

    @Reference
    private IProductService productService;

    @RequestMapping("findAllProduct")
    @ResponseBody
    public List<TProduct> findAllProduct(){
        return productService.findAllProduct();
    }

    /**
     * 查询所有商品列表
     */
    @RequestMapping("all")
    public String allProduct(Model model){
        List<TProduct> allProduct = productService.findAllProduct();
        model.addAttribute("products",allProduct);
        return "index";
    }

    /**
     * 添加商品
     * @param productAddDTO
     * @return
     */
    @RequestMapping("addProduct")
    public ResultBean addProduct(TProductAddDTO productAddDTO){
        productService.addProduct(productAddDTO);
        return ResultBean.success("添加商品成功");
    }

    /**
     * 通过商品id删除商品信息
     * @param pid
     * @return
     */
    @RequestMapping("deleteProduct/{pid}")
    public ResultBean deleteProduct(@PathVariable("pid") Long pid){
        productService.deleteProductByPid(pid);
        return ResultBean.success("删除商品成功");
    }

    /**
     * 根据pid获得完整的商品信息
     * @param pid
     * @return
     */
    @RequestMapping("{pid}")
    @ResponseBody
    public ResultBean findProductByPid(@PathVariable("pid") Long pid){
        System.out.println(pid);
        ResultBean resultBean = productService.selectTProductInfo(pid);
        return resultBean;
    }

    @RequestMapping("editProduct")
    public ResultBean editProduct(TProductAddDTO productAddDTO){
        productService.updateProductById(productAddDTO);
        return ResultBean.success("修改成功");
    }
}
