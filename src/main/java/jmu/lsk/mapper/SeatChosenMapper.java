package jmu.lsk.mapper;

import jmu.lsk.po.SeatChosen;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SeatChosenMapper {
    //1.insert into a record;
    public int insertSeatChosen(SeatChosen seatChosen);
}
