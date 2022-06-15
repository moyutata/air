package jmu.lsk.service;


import jmu.lsk.po.Passenger;

import java.util.List;

public interface PassengerService {
    //1.insert new passenger
    public int insertPassenger(Passenger passenger);
    //2.delete passenger
    public int deletePassenger(String idNumber);
    //3.update passenger info
    public int updatePassenger(Passenger passenger);
    //4.query passenger
    public List<Passenger> queryPassenger(String loginId);
    //5.find passenger by idNumber
    public Passenger findByIdNumber(String idNumber);
}
