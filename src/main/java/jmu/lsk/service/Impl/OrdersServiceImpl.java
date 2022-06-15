package jmu.lsk.service.Impl;


import jmu.lsk.mapper.OrdersMapper;
import jmu.lsk.po.Orders;
import jmu.lsk.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> queryOrders(String loginId) {
        List<Orders> orders = this.ordersMapper.queryOrders(loginId);
        return orders;
    }

    @Override
    public int deleteOrder(int orderId) {
        return this.ordersMapper.deleteOrder(orderId);
    }

    @Override
    public int insertOrder(Orders order) {
        return this.ordersMapper.insertOrder(order);
    }

    @Override
    public Orders queryLatest() {
        return this.ordersMapper.queryLatest();
    }
}
