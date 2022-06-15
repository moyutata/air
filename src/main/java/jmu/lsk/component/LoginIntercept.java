//package jmu.lsk.component;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class LoginIntercept implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//       Object user=request.getSession().getAttribute("userP");
//        if(user==null){
//            request.setAttribute("msg","请先登录");
//            request.getRequestDispatcher("/").forward(request,response);
//            return false;
//        }
//        else{
//            return true;
//        }
//
//    }
//}
