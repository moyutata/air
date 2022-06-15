package jmu.lsk.control;

import jmu.lsk.mapper.SeatChosenMapper;
import jmu.lsk.mapper.TicketMapper;
import jmu.lsk.po.SeatChosen;
import jmu.lsk.po.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeatChosenController {
    @Autowired
    private SeatChosenMapper seatChosenMapper;
    @Autowired
    private TicketMapper ticketMapper;

    @RequestMapping("/insertSeatChosen")
    public String insertSeatChosen(SeatChosen seatChosen){
        Ticket ticket = new Ticket();
        ticket.setTicketId(seatChosen.getTicketId());
        ticket.setSeatId(seatChosen.getSeatId());
        this.seatChosenMapper.insertSeatChosen(seatChosen);
        this.ticketMapper.updateTicket(ticket);
        return "login_success";
    }
}
