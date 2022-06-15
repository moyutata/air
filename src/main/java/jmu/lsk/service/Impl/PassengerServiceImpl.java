package jmu.lsk.service.Impl;


import jmu.lsk.mapper.PassengerMapper;
import jmu.lsk.po.Passenger;
import jmu.lsk.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerMapper passengerMapper;

    @Override
    public int insertPassenger(Passenger passenger) {
        int effectNum = passengerMapper.insertPassenger(passenger);
        return effectNum;
    }

    @Override
    public int deletePassenger(String idNumber) {
        int effectNum = passengerMapper.deletePassenger(idNumber);
        return effectNum;
    }

    @Override
    public int updatePassenger(Passenger passenger) {
        int effectNum = passengerMapper.updatePassenger(passenger);
        return effectNum;
    }

    @Override
    public List<Passenger> queryPassenger(String loginId) {
        return null;
    }

    @Override
    public Passenger findByIdNumber(String idNumber) {
        return this.passengerMapper.findByIdNumber(idNumber);
    }
}
