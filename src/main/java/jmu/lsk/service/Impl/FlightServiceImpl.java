package jmu.lsk.service.Impl;

import jmu.lsk.mapper.FlightMapper;
import jmu.lsk.po.Count;
import jmu.lsk.po.Flight;
import jmu.lsk.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightMapper flightMapper;
    @Override
    public List<Flight> AllFlight() {
        List<Flight> list=flightMapper.AllFlight();
        return list;
    }

    @Override
    public int addRoute(Flight flight) {
        int flag=flightMapper.addRoute(flight);
        return flag;
    }

    @Override
    public Flight selectFlight(int Id) {
        Flight flight=flightMapper.selectFlight(Id);
        return flight;
    }

    @Override
    public List<Flight> selectReport(int Id, String start, String end) {
        List<Count> counts=flightMapper.selectCount(Id,start,end);
        List<Flight> list=flightMapper.selectReport(Id,start,end);
        int i=0,j=0;
        for(i=0;i<list.size();i++)
        {
            if(j<counts.size())
            list.get(i).setFinishSale(counts.get(j).getTicks());
            else
                list.get(i).setFinishSale(0);
            j++;
        }
        return list;
    }

    @Override
    public List<Count> selectCount(int Id, String start, String end) {
        List<Count> list=flightMapper.selectCount(Id,start,end);
        return list;
    }

    @Override
    public int selectAllSeat(int Id) {
        int flag=flightMapper.selectAllSeat(Id);
        return flag;
    }

    @Override
    public int deleteFlight(int Id) {
        int flag=flightMapper.deleteFlight(Id);
        return flag;
    }
    //张
    @Override
    public List<Flight> queryFlight() {
        List<Flight> flightList = this.flightMapper.queryFlight();
        return flightList;
    }

    @Override
    public List<Flight> queryFlightByTime() {

        return null;
    }


}
