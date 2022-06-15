package jmu.lsk.service.Impl;

import jmu.lsk.mapper.CityMapper;
import jmu.lsk.po.City;
import jmu.lsk.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityMapper cityMapper;
    @Override
    public List<City> allCity() {
        List<City> list=cityMapper.allCity();
        return list;
    }
}
