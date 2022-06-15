package jmu.lsk.mapper;

import jmu.lsk.po.City;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CityMapper {
    public List<City> allCity();
}
