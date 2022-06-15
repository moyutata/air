package jmu.lsk.mapper;

import jmu.lsk.po.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    public String check(Admin admin);
}
