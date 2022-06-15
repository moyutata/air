package jmu.lsk.service.Impl;

import jmu.lsk.mapper.ProvinceMapper;
import jmu.lsk.po.Province;
import jmu.lsk.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceMapper provinceMapper;
    @Override
    public List<Province> allProvince() {
        List<Province> list=provinceMapper.allProvince();
        return list;
    }
}
