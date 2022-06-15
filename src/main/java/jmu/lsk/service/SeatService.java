package jmu.lsk.service;


import jmu.lsk.po.Seat;

import java.util.List;

public interface SeatService {
    //1.query seats
    public List<Seat> querySeats(Seat seat);
}
