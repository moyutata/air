package jmu.lsk.service.Impl;
import jmu.lsk.mapper.SeatMapper;
import jmu.lsk.po.Seat;
import jmu.lsk.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SeatServiceImpl implements SeatService {
    @Autowired
    private SeatMapper seatMapper;

    @Override
    public List<Seat> querySeats(Seat seat) {
        return this.seatMapper.querySeats(seat);
    }
}
