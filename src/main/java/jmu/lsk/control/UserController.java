package jmu.lsk.control;

import jmu.lsk.mapper.UserMapper;
import jmu.lsk.po.User;
import jmu.lsk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/selectAllMembers")
    public String selectAllMembers(Map<String,Object> map){
        List<User> list=userService.allUser();
        map.put("msg",list);
        return "selectAllMembers";
    }
    //张
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/insertUser.do")
    public String insertUser(User user, Model model){
        int effectNum = 0;
        if(user.getLoginId()==""){
            model.addAttribute("loginmsg","请输入账号");
            return "register";
        } else if(user.getPassword()==""){
            model.addAttribute("passmsg","请输入密码");
            return "register";
        } else if(user.getConfirm()==""){
            model.addAttribute("confirmmsg","确认密码栏不能为空");
            return "register";
        } else if(user.getPassword().equals(user.getConfirm())){
            effectNum = userMapper.insertUser(user);
            model.addAttribute("effectNum",effectNum);
            return "mainpage";
        } else{
            model.addAttribute("msg","两次输入密码不一致！");
            return "register";
        }
    }

    @PostMapping(value = "/certificate")
    public String certificate(String loginId, String password, Model model, HttpSession session){
        String url = "mainpage";
        User user = userMapper.certificate(loginId);
        if(password.equals(user.getPassword())){
            session.setAttribute("user",user);
            url = "login_success";
        }else{
            model.addAttribute("msg","用户名或密码错误!");
        }
        return url;
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "mainpage";
    }
}
