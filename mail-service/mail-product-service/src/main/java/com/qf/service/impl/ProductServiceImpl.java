package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dto.ResultBean;
import com.qf.dto.TProductAddDTO;
import com.qf.entity.TProduct;
import com.qf.entity.TProductDesc;
import com.qf.mapper.TProductDescMapper;
import com.qf.mapper.TProductMapper;
import com.qf.product.api.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private TProductMapper productMapper;

    @Autowired
    private TProductDescMapper descMapper;

    @Override
    public List<TProduct> findAllProduct() {
        return productMapper.findAllProduct();
    }

    //    通过pid获得完整的商品信息
    @Override
    public ResultBean selectTProductInfo(Long pid) {
        System.out.println(pid);
        TProductAddDTO productDTO =new TProductAddDTO();
        TProduct tProduct = productMapper.selectByPrimaryKey(pid);
        System.out.println(tProduct);
        TProductDesc tProductDesc = descMapper.selectByPid(pid);
        System.out.println(tProductDesc);
        //封装
        productDTO.setPdesc(tProductDesc.getPdesc());
        productDTO.setCreateTime(tProduct.getCreateTime());
        productDTO.setCreateUser(tProduct.getCreateUser());
        productDTO.setFlag(tProduct.getFlag());
        productDTO.setPid(tProduct.getPid());
        productDTO.setPimage(tProduct.getPimage());
        productDTO.setPname(tProduct.getPname());
        productDTO.setPrice(tProduct.getPrice());
        productDTO.setSalePrice(tProduct.getSalePrice());
        productDTO.setStatus(tProduct.getStatus());
        productDTO.setTypeId(tProduct.getTypeId());
        productDTO.setUpdateTime(tProduct.getUpdateTime());
        productDTO.setUpdateUser(tProduct.getUpdateUser());
        System.out.println(productDTO);

        return ResultBean.success(productDTO);
    }

    @Override
    public ResultBean addProduct(TProductAddDTO productAddDTO) {
        try {
            productMapper.insert(productAddDTO);
            TProductDesc tProductDesc=new TProductDesc();
            tProductDesc.setPid(productAddDTO.getPid());
            tProductDesc.setPdesc(productAddDTO.getPdesc());
            descMapper.insert(tProductDesc);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBean.error("添加商品失败");
        }

        return ResultBean.success("添加商品成功");
    }

    //删除
    @Override
    public ResultBean deleteProductByPid(Long pid) {
        int i = productMapper.deleteByPrimaryKey(pid);
        int i1 = descMapper.deleteDescPid(pid);
        return ResultBean.success("删除商品成功");
    }
    //修改商品信息
    @Override
    public ResultBean updateProductById(TProductAddDTO productDTO) {
        try {
            //更新物品基础信息表
            productMapper.updateByPrimaryKey(productDTO);
            //修改物品详情表
            Map map=new HashMap();
            map.put("pid",productDTO.getPid());
            map.put("pdesc",productDTO.getPdesc());
            descMapper.updateDescPid(map);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBean.error("修改商品信息失败");
        }
        return ResultBean.success("修改商品信息成功");
    }


}
