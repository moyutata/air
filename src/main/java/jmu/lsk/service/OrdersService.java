package jmu.lsk.service;


import jmu.lsk.po.Orders;

import java.util.List;

public interface OrdersService {
    //1.query all orders;
    public List<Orders> queryOrders(String loginId);
    //2.delete an order
    public int deleteOrder(int orderId);
    //3.insert an order;
    public int insertOrder(Orders order);
    //4.query the latest order
    public Orders queryLatest();
}
