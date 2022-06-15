package jmu.lsk.service;

import jmu.lsk.po.Count;
import jmu.lsk.po.Flight;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlightService {
    public List<Flight> AllFlight();
    public int addRoute(Flight flight);
    public Flight selectFlight(int Id);
    public List<Flight> selectReport(@Param("Id")int Id, @Param("start")String start, @Param("end") String end);
    public List<Count>  selectCount(@Param("Id")int Id, @Param("start")String start, @Param("end") String end);
    public int selectAllSeat(int Id);
    public int deleteFlight(int Id);
    //张
    //1.query top 10 least price
    public List<Flight> queryFlight();
    //2.query flight by departTime
    public List<Flight> queryFlightByTime();
}
