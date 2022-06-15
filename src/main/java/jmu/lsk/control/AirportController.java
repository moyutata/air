package jmu.lsk.control;

import jmu.lsk.po.*;
import jmu.lsk.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class AirportController {
    @Autowired
    ExecFlightService execFlightService;
    @Autowired
    AirportService airportService;
    @Autowired
    CityService cityService;
    @Autowired
    ProvinceService provinceService;
    @Autowired
    TerminalService terminalService;
    @RequestMapping("/selectAllAirport")
    public String selectAllAirport(Map<String,Object> map){
        List<Airport> list=airportService.allAirport();
        map.put("msg",list);
        return "selectAllAirport";
    }
    @RequestMapping("/addAirport")
    public String addAirport(Map<String,Object> mapC,Map<String,Object> mapP){
        List<Province> provinces=provinceService.allProvince();
        List<City> city=cityService.allCity();
        mapC.put("msgC",city);
        mapP.put("msgP",provinces);
        return "addAirport";
    }
    @RequestMapping("/addAirports")
    public String addAirports(Airport airport){
        int flag=airportService.addAirport(airport);
        return "redirect:selectAllAirport";
    }
    @RequestMapping("/selectTerminal")
    public String selectTerminal(int Id,Map<String,Object> map,Map<String,Object> mapId){
       List<Terminal> list=terminalService.selectTerminal(Id);
       mapId.put("ms",Id);
       map.put("msg",list);
       return "selectTerminal";
    }
    @RequestMapping("/addTerminal")
    public String addTerminals(int airportId,Map<String,Object> map){
        map.put("msg",airportId);
        return "addTerminal";
    }
    @RequestMapping("/addTerminals")
    public String addTerminals(Terminal terminal){
    int flag=terminalService.addTerminal(terminal);
    return "redirect:selectTerminal?Id="+terminal.getAirportId();
    }
    @RequestMapping("/selectAllAircraft")
    public String selectAllAircraft(Map<String,Object> map){
        List<Aircraft> aircraft=airportService.allAircraft();
        map.put("msg",aircraft);
        return "selectAllAircraft";
    }
    @RequestMapping("/addAircraftS")
    public String addAircraftS(Aircraft aircraft){
        int flag=airportService.addAircraft(aircraft);
        return "redirect:selectAllAircraft";
    }
    @RequestMapping("/selectSeat")
    public String selectSeat(int aircraftId,Map<String,Object> map){
        List<Seat> seats=airportService.allSeat(aircraftId);
        map.put("msg",seats);
        map.put("ms",aircraftId);
        return "selectSeat";
    }
    @RequestMapping("/deleteSeat")
    public String deleteSeat(Seat seat){
        int flag=airportService.deleteSeat(seat);
        return "redirect:selectSeat?aircraftId="+seat.getAircraftId();
    }
    @RequestMapping("/addSeat")
    public String addSeat(int Id,Map<String,Object> map){
        List<Shipping> ship = execFlightService.allShipping();
        map.put("msg",Id);
        map.put("msgS",ship);
        return "addSeat";
    }
    @RequestMapping("/addSeats")
    public String addSeats(Seat seat){
        int flag=airportService.addSeat(seat);
        return "redirect:/selectSeat?aircraftId="+seat.getAircraftId();
    }
    @RequestMapping("/addShippingS")
    public String addSipping(Shipping shipping){
        int flag=airportService.addShipping(shipping);
        return "redirect:/selectAllAircraft";
    }
    @RequestMapping("/deleteAirport")
    public String deleteAirport(int Id){
        int flag=airportService.deleteAirport(Id);
        return "redirect:selectAllAirport";
    }
    @RequestMapping("/updateAirport")
    public String updateAirport(int Id,Map<String,Object> map){
        Airport airport=airportService.selectAirport(Id);
        List<Province> provinces=provinceService.allProvince();
        List<City> city=cityService.allCity();
        map.put("msgC",city);
        map.put("msgP",provinces);
        map.put("msg",airport);
        return "updateAirport";
    }
    @RequestMapping("/updateAirports")
    public String updateAirports(Airport airport) {
        int flag = airportService.updateAirport(airport);
        return "redirect:/selectAllAirport";
    }
    @RequestMapping("deleteAircraft")
    public String deleteAircraft(int aircraftId){
        int flag=airportService.deleteAircraft(aircraftId);
        return "redirect:/selectAllAircraft";
    }
    @RequestMapping("/updateAircraft")
    public String updateAircraft(int aircraftId,Map<String,Object>map){
        Aircraft aircraft=airportService.selectAircraft(aircraftId);
        map.put("msg",aircraft);
        return "updateAircraft";
    }
    @RequestMapping("/updateAircraftS")
    public String updateAircraftS(Aircraft aircraft){
        int flag=airportService.updateAircraft(aircraft);
        return "redirect:/selectAllAircraft";
    }
}
