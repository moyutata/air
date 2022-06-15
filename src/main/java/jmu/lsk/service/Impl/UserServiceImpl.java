package jmu.lsk.service.Impl;

import jmu.lsk.mapper.UserMapper;
import jmu.lsk.po.User;
import jmu.lsk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> allUser() {
        List<User> list=userMapper.allUser();
        return list;
    }
    //张
    @Transactional
    public int insertUser(User user) {
        int effectNum = 0;
        effectNum = userMapper.insertUser(user);
        return effectNum;
    }

    public User certificate(String loginId) {
        return userMapper.certificate(loginId);
    }
}
