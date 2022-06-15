package jmu.lsk.service.Impl;

import jmu.lsk.mapper.SeatChosenMapper;
import jmu.lsk.po.SeatChosen;
import jmu.lsk.service.SeatChosenService;
import org.springframework.beans.factory.annotation.Autowired;

public class SeatChosenImpl implements SeatChosenService {
    @Autowired
    private SeatChosenMapper seatChosenMapper;

    @Override
    public int insertSeatChosen(SeatChosen seatChosen) {
        return this.seatChosenMapper.insertSeatChosen(seatChosen);
    }
}
