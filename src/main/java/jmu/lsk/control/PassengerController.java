package jmu.lsk.control;

import jmu.lsk.mapper.LinkMapper;
import jmu.lsk.mapper.PassengerMapper;
import jmu.lsk.po.Link;
import jmu.lsk.po.Passenger;
import jmu.lsk.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class PassengerController {
    @Autowired
    private PassengerMapper passengerMapper;
    @Autowired
    private LinkMapper linkMapper;

    @RequestMapping("/insertPassenger")
    public String insertPassenger(Passenger passenger, Link link, HttpSession session){
        Date linkDate = new Date();
        link.setLinkTime(linkDate);
        this.passengerMapper.insertPassenger(passenger);
        this.linkMapper.insertLink(link);
        session.setAttribute("passenger",passenger);
        return "confirmTicket";
    }

    @RequestMapping("/deletePassenger")
    public String deletePassenger(String idNumber,String loginId,String userId){
        Link link = new Link();
        link.setIdNumber(idNumber);
        link.setLoginId(loginId);
        link.setUserId(userId);
        this.linkMapper.deleteLink(link);
        this.passengerMapper.deletePassenger(idNumber);
        return "passenger_success";
    }

    @RequestMapping("/updatePassenger")
    public String updatePassenger(Passenger passenger){
        this.passengerMapper.updatePassenger(passenger);
        return "passenger_success";
    }

    @RequestMapping("/queryPassenger")
    public String queryPassenger(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        String loginId = user.getLoginId();
        List<Passenger> passengers = passengerMapper.queryPassenger(loginId);
        if(passengers.size()==0){
            model.addAttribute("msg","您当前未添加任何乘机人员哦");
        }else{
            model.addAttribute("passengers",passengers);
        }
        return "passengers";
    }

    @RequestMapping("/findByIdNumber")
    public String findByIdNumber(String idNumber,Model model){
        Passenger passenger = passengerMapper.findByIdNumber(idNumber);
        model.addAttribute("passenger",passenger);
        return "updatePassenger";
    }
}
