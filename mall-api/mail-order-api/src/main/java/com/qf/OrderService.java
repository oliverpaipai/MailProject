package com.qf;


import com.qf.entity.TOrder;

import java.util.List;

public interface OrderService {

    //添加订单
    int insertOrder(TOrder order);
    //通过id删除订单
    int deleteOrderById(Integer oid);
    //通过id修改订单
    int updateOrderById(Integer oid);
    //查询所有订单信息
    List<TOrder> selectAllOrder();
    //通过id查询订单信息
    TOrder selectOrderById(Integer oid);
}
