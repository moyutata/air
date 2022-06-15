package jmu.lsk.service.Impl;

import jmu.lsk.mapper.AdminMapper;
import jmu.lsk.po.Admin;
import jmu.lsk.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Override
    public String check(Admin admin) {
        String flag=adminMapper.check(admin);
        return flag;
    }
}
