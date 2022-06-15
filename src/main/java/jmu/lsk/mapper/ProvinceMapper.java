package jmu.lsk.mapper;

import jmu.lsk.po.Province;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProvinceMapper {
    public List<Province> allProvince();
}
