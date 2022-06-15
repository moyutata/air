package jmu.lsk.service.Impl;

import jmu.lsk.mapper.TerminalMapper;
import jmu.lsk.mapper.TicketMapper;
import jmu.lsk.po.Terminal;
import jmu.lsk.po.Ticket;
import jmu.lsk.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TerminalServiceImpl implements TerminalService {
    @Autowired
    TerminalMapper terminalMapper;
    @Autowired
    TicketMapper ticketMapper;
    @Override
    public List<Terminal> selectTerminal(int Id) {
        List<Terminal> list=terminalMapper.selectTerminal(Id);
        return list;
    }

    @Override
    public List<Terminal> allTerminal() {
        List<Terminal> list=terminalMapper.allTerminal();
        return list;
    }

    @Override
    public int addTerminal(Terminal terminal) {
        int flag=terminalMapper.addTerminal(terminal);
        return flag;
    }
    //张
    @Override
    public int insertTicket(Ticket ticket) {
        return this.ticketMapper.insertTicket(ticket);
    }

    @Override
    public int deleteTicket(int orderId) {
        return this.ticketMapper.deleteTicket(orderId);
    }

    @Override
    public Ticket queryTicket(String ticketId) {
        return this.ticketMapper.queryTicket(ticketId);
    }

    @Override
    public int updateTicket(Ticket ticket) {
        return this.ticketMapper.updateTicket(ticket);
    }
}
