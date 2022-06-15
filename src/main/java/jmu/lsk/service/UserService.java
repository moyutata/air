package jmu.lsk.service;

import jmu.lsk.po.User;

import java.util.List;

public interface UserService {
    public List<User> allUser();
    //张
    //1.register a new user;
    public int insertUser(User user);
    //2.certificate login;
    public User certificate(String loginId);   //return password;
}
