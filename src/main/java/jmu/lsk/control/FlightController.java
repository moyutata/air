package jmu.lsk.control;

import jmu.lsk.mapper.AirportMapper;
import jmu.lsk.mapper.FlightMapper;
import jmu.lsk.po.*;
import jmu.lsk.service.AirportService;
import jmu.lsk.service.CityService;
import jmu.lsk.service.FlightService;
import jmu.lsk.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Controller
public class FlightController {
    @Autowired
    AirportService airportService;
    @Autowired
    TerminalService terminalService;
    @Autowired
    CityService cityService;
    @Autowired
    FlightService flightService;
    @RequestMapping("/selectAllRoute")
    public String selectAllRoute(Map<String,Object> map){
        List<Flight> list=flightService.AllFlight();
        map.put("msg",list);
        return "selectAllRoute";
    }
    @RequestMapping("/addRoute")
    public String addRoute(Map<String,Object> mapA,Map<String,Object> mapT,Map<String,Object> mapC,Map<String,Object> mapH){
        List<Airport> air=airportService.allAirport();
        List<Terminal> ter=terminalService.allTerminal();
        List<City> city=cityService.allCity();
        List<Aircraft> aircrafts=airportService.allAircraft();
        mapC.put("msgC",city);
        mapA.put("msgA",air);
        mapH.put("msgH",aircrafts);
        mapT.put("msgT",ter);
        return "addRoute";
    }
    @RequestMapping("/addRoutes")
    public String addRoutes(Flight flight){
        int flag= flightService.addRoute(flight);
        return "redirect:selectAllRoute";
    }
    @RequestMapping("/selectReports")
    public String selectReports(int aircraftId,Map<String,Object> map){
        map.put("msg",aircraftId);
        return "selectReports";
    }
    @RequestMapping("/selectReport")
    public String selectReport(int Id,String timeStart,String timeEnd,Map<String,Object> map){
        List<Flight> flights=flightService.selectReport(Id,timeStart,timeEnd);
        int sum=flightService.selectAllSeat(Id);
        map.put("msgF",flights);
        map.put("msgS",sum);
        return "selectReport";
    }
    @RequestMapping("/deleteFlight")
    public String deleteFlight(int Id){
        int flag=flightService.deleteFlight(Id);
        return "redirect:selectAllRoute";
    }
    //张
    @Autowired
    private FlightMapper flightMapper;

    @RequestMapping("/queryFlight")
    public String queryFlight(Model model){
        List<Flight> flightList = this.flightMapper.queryFlight();
        model.addAttribute("flightList",flightList);
        return "mainpage2";
    }

}
