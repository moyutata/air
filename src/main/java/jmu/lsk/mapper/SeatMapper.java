package jmu.lsk.mapper;

import jmu.lsk.po.Seat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SeatMapper {
    //1.query seats
    public List<Seat> querySeats(Seat seat);
}
