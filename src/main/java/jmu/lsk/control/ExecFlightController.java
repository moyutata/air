package jmu.lsk.control;

import jmu.lsk.mapper.ExecFlightMapper;
import jmu.lsk.po.*;
import jmu.lsk.service.ExecFlightService;
import jmu.lsk.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ExecFlightController {
    @Autowired
    FlightService flightService;
    @Autowired
    ExecFlightService execFlightService;
    @RequestMapping("/selectExecFlight")
    public String selectExecFlight(int flightId,String aircraftName ,Map<String ,Object> map,Map<String ,Object>mapId,Map<String ,Object> mapName){
        ExecutiveFlight executiveFlights=execFlightService.selectExecFlight(flightId);
        mapId.put("mi",flightId);
        map.put("msg",executiveFlights);
        mapName.put("mn",aircraftName);
        return "selectExecFlight";
    }
    @RequestMapping("/selectTicketTypes")
    public  String selectTicketTypes(int execId,Map<String ,Object> map){
        List<TicketTypes> ticketTypes=execFlightService.selectTicketTypes(execId);
        map.put("msg",ticketTypes);
        map.put("ms",execId);
        return "selectTicketTypes";
    }
    @RequestMapping("/addExecFlight")
    public String addExecFlight(int flightId,Map<String ,Object> map) {
        Flight flight = flightService.selectFlight(flightId);
        map.put("msgF", flight);
        return "addExecFlight";
    }
    @RequestMapping("/addExecFlights")
    public String addExecFlights(ExecutiveFlight executiveFlight,Map<String ,Object> map) {
        if(executiveFlight.getActualDepartureR().equals(""))
            executiveFlight.setActualDepartureR(null);
        if(executiveFlight.getActualArrivalR().equals(""))
            executiveFlight.setActualArrivalR(null);
        int flag=execFlightService.addExecFlight(executiveFlight);
        return "redirect:/selectAllRoute";
    }
    @RequestMapping("/addTicketTypes")
    public String addTicketTypes(int execId,Map<String ,Object> map){
        List<Shipping> ship = execFlightService.allShipping();
        map.put("msgS",ship);
        map.put("msgE",execId);
        return "addTicketTypes";
    }
    @RequestMapping("/addTicketType")
    public String addTicketType(TicketTypes ticketTypes){
        int flag=execFlightService.addTicketTypes(ticketTypes);
        return "redirect:/selectTicketTypes?execId="+ticketTypes.getExecId();
    }
    @RequestMapping("/deleteExecFlight")
    public String deleteExecFlight(int execId){
        int flag=execFlightService.deleteExecFlight(execId);
        return "redirect:/selectAllRoute";
    }
    @RequestMapping("/updateExecFlight")
    public String updateExecFlight(int execId,Map<String ,Object> map)
    {
        ExecutiveFlight executiveFlight=execFlightService.selectExecF(execId);
        map.put("msg",executiveFlight);
        return "updateExecFlight";
    }
    @RequestMapping("/updateExecFlights")
    public String updateExecFlights(ExecutiveFlight executiveFlight){
        if(executiveFlight.getActualDepartureR().equals(""))
            executiveFlight.setActualDepartureR(null);
        if(executiveFlight.getActualArrivalR().equals(""))
            executiveFlight.setActualArrivalR(null);
        System.out.println(executiveFlight.toString());
        int flag=execFlightService.updateExecFlight(executiveFlight);
        return "redirect:/selectAllRoute";
    }
    @RequestMapping("/deleteTicketTypes")
    public String deleteTicketTypes(TicketTypes ticketTypes){
        int flag=execFlightService.deleteTicketTypes(ticketTypes);
        return "redirect:/selectTicketTypes?execId="+ticketTypes.getExecId();
    }
    //张
    @Autowired
    private ExecFlightMapper executiveFlightMapper;

    @RequestMapping("/searchFlight")
    public String findFlightBySituation(String depart, String arrival, String execDate, Model model){
        Flight flight = new Flight();
        flight.setDepart(depart);
        flight.setArrival(arrival);
        flight.setDeTime(execDate);
        List<ExecutiveFlight> executiveFlights = this.executiveFlightMapper.findFlightBySituation(flight);
        model.addAttribute("execFlights",executiveFlights);
        return "flights";
    }

    @RequestMapping("/findExactFlight")
    public String exactFlightBySituation(String depart, String arrival, String execDate, int execId, String shippingId, HttpSession session) {
        exactFlight exactFlight = new exactFlight();
        exactFlight.setDepart(depart);
        exactFlight.setArrival(arrival);
        exactFlight.setDeTime(execDate);
        exactFlight.setExecId(execId);
        exactFlight.setShippingId(shippingId);
        ExecutiveFlight executiveFlight = this.executiveFlightMapper.exactFlightBySituation(exactFlight);
        session.setAttribute("execFlight",executiveFlight);
        session.setAttribute("exactFlight",exactFlight);
        return "orderTicket";
    }

}
