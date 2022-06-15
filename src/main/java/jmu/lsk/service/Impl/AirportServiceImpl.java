package jmu.lsk.service.Impl;

import jmu.lsk.mapper.AirportMapper;
import jmu.lsk.po.Aircraft;
import jmu.lsk.po.Airport;
import jmu.lsk.po.Seat;
import jmu.lsk.po.Shipping;
import jmu.lsk.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {
    @Autowired
    AirportMapper airportMapper;
    @Override
    public List<Airport> allAirport() {
        List<Airport> list=airportMapper.allAirport();
        return list;
    }

    @Override
    public int addAirport(Airport airport) {
        int flag=airportMapper.addAirport(airport);
        return flag;
    }

    @Override
    public List<Aircraft> allAircraft() {
        List<Aircraft> list=airportMapper.allAircraft();
        return list;
    }

    @Override
    public int addAircraft(Aircraft aircraft) {
        int flag=airportMapper.addAircraft(aircraft);
        return flag;
    }

    @Override
    public List<Seat> allSeat(int aircraft) {
        List<Seat> list=airportMapper.allSeat(aircraft);
        return list;
    }

    @Override
    public int addSeat(Seat seat) {
        int flag=airportMapper.addSeat(seat);
        return flag;
    }

    @Override
    public int addShipping(Shipping shipping) {
        int flag=airportMapper.addShipping(shipping);
        return flag;
    }

    @Override
    public int deleteAirport(int Id) {
        int flag=airportMapper.deleteAirport(Id);
        return flag;
    }

    @Override
    public int updateAirport(Airport airport) {
        int flag=airportMapper.updateAirport(airport);
        return flag;
    }

    @Override
    public Airport selectAirport(int Id) {
        Airport airport=airportMapper.selectAirport(Id);
        return airport;
    }

    @Override
    public int deleteAircraft(int Id) {
        int flag=airportMapper.deleteAircraft(Id);
        return flag;
    }

    @Override
    public int updateAircraft(Aircraft aircraft) {
        int flag=airportMapper.updateAircraft(aircraft);
        return flag;
    }

    @Override
    public Aircraft selectAircraft(int Id) {
        Aircraft aircraft=airportMapper.selectAircraft(Id);
        return aircraft;
    }

    @Override
    public int deleteSeat(Seat seat) {
        int flag=airportMapper.deleteSeat(seat);
        return flag;
    }
}
