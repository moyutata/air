package jmu.lsk.control;

import jmu.lsk.mapper.TicketMapper;
import jmu.lsk.po.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TicketController {
    @Autowired
    private TicketMapper ticketMapper;

    @RequestMapping("/insertTicket")
    public String insertTicket(Ticket ticket){
        this.ticketMapper.insertTicket(ticket);
        return "insert_success";
    }

    @RequestMapping("/deleteTicket")
    public String deleteTicket(int orderId){
        this.ticketMapper.deleteTicket(orderId);
        return "refund";
    }

    @RequestMapping("/queryTicket")
    public String queryTicket(String ticketId, Model model,HttpSession session){
        Ticket tickets = this.ticketMapper.queryTicket(ticketId);
        session.setAttribute("tickets",tickets);
        model.addAttribute("tickets",tickets);
        return "tickets";
    }
}
