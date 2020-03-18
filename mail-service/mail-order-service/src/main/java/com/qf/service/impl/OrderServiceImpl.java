package com.qf.service.impl;


import com.qf.OrderService;
import com.qf.entity.TOrder;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Override
    public int insertOrder(TOrder order) {
        return 0;
    }

    @Override
    public int deleteOrderById(Integer oid) {
        return 0;
    }

    @Override
    public int updateOrderById(Integer oid) {
        return 0;
    }

    @Override
    public List<TOrder> selectAllOrder() {
        return null;
    }

    @Override
    public TOrder selectOrderById(Integer oid) {
        return null;
    }
}
