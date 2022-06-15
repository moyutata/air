package jmu.lsk.service;

import jmu.lsk.po.Terminal;
import jmu.lsk.po.Ticket;

import java.util.List;

public interface TerminalService {
    public List<Terminal> selectTerminal(int Id);
    public List<Terminal> allTerminal();
    public int addTerminal(Terminal terminal);
    //张
    //1.insert new ticket
    public int insertTicket(Ticket ticket);
    //2.delete a ticket
    public int deleteTicket(int orderId);
    //3.query a ticket by ticketId
    public Ticket queryTicket(String ticketId);
    //4.update ticket;
    public int updateTicket(Ticket ticket);
}
