package jmu.lsk.mapper;

import jmu.lsk.po.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> allUser();
    //张
    //1.register a new user;
    public int insertUser(User user);
    //2.certificate login;
    public User certificate(String loginId);   //return password;
}
