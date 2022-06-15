package jmu.lsk.mapper;

import jmu.lsk.po.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExecFlightMapper {
    public ExecutiveFlight selectExecFlight(int Id);
    public int addExecFlight(ExecutiveFlight executiveFlight);
    public List<TicketTypes> selectTicketTypes(int Id);
    public int addTicketTypes(TicketTypes ticketTypes);
    public List<Shipping> allShipping();
    public int updateExecFlight(ExecutiveFlight ex);
    public int deleteExecFlight(int Id);
    public ExecutiveFlight selectExecF(int Id);
    public int deleteTicketTypes(TicketTypes ticketTypes);
    //张
    // 1.query flights by departCity+arrivalCity+departureTime
    public List<ExecutiveFlight> findFlightBySituation(Flight flight);
    //2.query flight departCity+arrivalCity+departureTime+execId+shippingId
    public ExecutiveFlight exactFlightBySituation(exactFlight exactFlight);
}
