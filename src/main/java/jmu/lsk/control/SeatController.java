package jmu.lsk.control;

import jmu.lsk.mapper.SeatMapper;
import jmu.lsk.po.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SeatController {
    @Autowired
    private SeatMapper seatMapper;

    @RequestMapping("/querySeats")
    public String querySeats(Integer aircraftId,String shippingId,String ticketId,Model model){
        Seat seat = new Seat();
        seat.setAircraftId(aircraftId);
        seat.setShippingId(shippingId);
        List<Seat> seats = this.seatMapper.querySeats(seat);
        model.addAttribute("seats",seats);
        model.addAttribute("ticketId",ticketId);
        return "check";
    }
}
