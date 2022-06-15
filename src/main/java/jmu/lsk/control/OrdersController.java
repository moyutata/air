package jmu.lsk.control;

import jmu.lsk.mapper.OrdersMapper;
import jmu.lsk.mapper.TicketMapper;
import jmu.lsk.po.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private TicketMapper ticketMapper;

    @RequestMapping("/queryOrders")
    public String queryOrders(String loginId, Model model){
        List<Orders> orders = ordersMapper.queryOrders(loginId);
        if(orders.size()==0){
            model.addAttribute("msg","当前未购买任何机票哦！");
        }else{
            model.addAttribute("orders",orders);
        }
        return "orders";
    }

    @RequestMapping("/deleteOrder")
    public String deleteOrder(int orderId){
        this.ticketMapper.deleteTicket(orderId);
        this.ordersMapper.deleteOrder(orderId);
        return "refund";
    }

    @RequestMapping("/insertOrder")
    public String insertOrder(Orders order,Model model){
        this.ordersMapper.insertOrder(order);
        Orders latestOrder = this.ordersMapper.queryLatest();
        model.addAttribute("order",latestOrder);
        return "finishOrder";
    }
}
