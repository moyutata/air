package jmu.lsk.control;
import jmu.lsk.po.Admin;
import jmu.lsk.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.util.Map;
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping(value = "/adminLoginJudge")
    public String Login(Admin admin, Map<String,Object> map, HttpSession session)
    {
        System.out.println(1);
        if(adminService.check(admin)==null){
            System.out.println(2);
            map.put("msg","用户名或密码错误");
            return "adminLogin";
        }
        else
        {
            //session.setAttribute("userP", admin.getLoginId());
            return "mainView";
        }
    }
    @RequestMapping("/loginSess")
    public  String loginSess(HttpSession session){
        session.invalidate();
        return "adminLogin";
    }
}
