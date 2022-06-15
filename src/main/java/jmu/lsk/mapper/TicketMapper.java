package jmu.lsk.mapper;


import jmu.lsk.po.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TicketMapper {
    //1.insert new ticket
    public int insertTicket(Ticket ticket);
    //2.delete a ticket
    public int deleteTicket(int orderId);
    //3.query a ticket by ticketId
    public Ticket queryTicket(String ticketId);
    //4.update ticket;
    public int updateTicket(Ticket ticket);
}
