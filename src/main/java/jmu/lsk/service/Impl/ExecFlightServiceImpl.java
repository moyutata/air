package jmu.lsk.service.Impl;

import jmu.lsk.mapper.ExecFlightMapper;
import jmu.lsk.po.*;
import jmu.lsk.service.ExecFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecFlightServiceImpl implements ExecFlightService {
    @Autowired
    ExecFlightMapper execFlightMapper;
    @Override
    public ExecutiveFlight selectExecFlight(int Id) {
        ExecutiveFlight executiveFlight=execFlightMapper.selectExecFlight(Id);
        return executiveFlight;
    }

    @Override
    public int addExecFlight(ExecutiveFlight executiveFlight) {
        int flag=execFlightMapper.addExecFlight(executiveFlight);
        return flag;
    }

    @Override
    public List<TicketTypes> selectTicketTypes(int Id) {
        List<TicketTypes> list=execFlightMapper.selectTicketTypes(Id);
        return list;
    }

    @Override
    public int addTicketTypes(TicketTypes ticketTypes) {
        int flag=execFlightMapper.addTicketTypes(ticketTypes);
        return flag;
    }

    @Override
    public List<Shipping> allShipping() {
        List<Shipping> list=execFlightMapper.allShipping();
        return list;
    }

    @Override
    public int updateExecFlight(ExecutiveFlight ex) {
        int flag=execFlightMapper.updateExecFlight(ex);
        return flag;
    }

    @Override
    public int deleteExecFlight(int Id) {
        int flag=execFlightMapper.deleteExecFlight(Id);
        return flag;
    }

    @Override
    public ExecutiveFlight selectExecF(int Id) {
        ExecutiveFlight executiveFlight=execFlightMapper.selectExecF(Id);
        return executiveFlight;
    }

    @Override
    public int deleteTicketTypes(TicketTypes ticketTypes) {
        int flag=execFlightMapper.deleteTicketTypes(ticketTypes);
        return flag;
    }
    @Override
    public List<ExecutiveFlight> findFlightBySituation(Flight flight) {
        return this.execFlightMapper.findFlightBySituation(flight);
    }

    @Override
    public ExecutiveFlight exactFlightBySituation(exactFlight exactFlight) {
        return this.execFlightMapper.exactFlightBySituation(exactFlight);
    }
}
