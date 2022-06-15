package jmu.lsk.mapper;

import jmu.lsk.po.Aircraft;
import jmu.lsk.po.Airport;
import jmu.lsk.po.Seat;
import jmu.lsk.po.Shipping;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportMapper {
    public List<Airport> allAirport();
    public int addAirport(Airport airport);
    public List<Aircraft> allAircraft();
    public int addAircraft(Aircraft aircraft);
    public List<Seat> allSeat(int aircraft);
    public int addSeat(Seat seat);
    public int addShipping(Shipping shipping);
    public int deleteAirport(int Id);
    public int updateAirport(Airport airport);
    public Airport selectAirport(int Id);
    public int deleteAircraft(int Id);
    public int updateAircraft(Aircraft aircraft);
    public Aircraft selectAircraft(int Id);
    public int deleteSeat(Seat seat);
}

