package controller;

import model.MembersBean;
import model.MembersService;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberFormController {
//    private static final long serialVersionUID = 1L;
//
//    private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//            .format(Calendar.getInstance().getTime());
//    private MembersService membersService;
//    public void init() throws ServletException {
//
//    }
//    @RequestMapping(
////        path = {"/pages/register/registerForm.controller"}
//    )
//    public void handlerMethod(String memberIdTemp, String memberAccouuntTemp, String memberPasswordTemp, String memberLastnameTemp,
//                              String memberFirstnameTemp, String memberGenderTemp, String memberNicknameTemp
//                              , String memberEmailTemp, String memberTelTemp, String memberAddrTemp, String memberBirthTemp,
//                              String createUserTemp, String createDateTemp, String updateUserTemp, String updateDateTemp
//                              , String prodaction, Model model, ServletContext application, HttpSession session){
//
//        application = this.getServletContext();
//        ApplicationContext context = (ApplicationContext) application.getAttribute(
//                WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
//        membersService = context.getBean("membersService", MembersService.class);
//
//
//        Map<String, String> errors = new HashMap<String, String>();
//        model.addAttribute("errors", errors);
//        //接收資料
//        //驗證資料
//        if(prodaction!=null) {
//            if(prodaction.equals("Insert") || prodaction.equals("Update") || prodaction.equals("Delete")) {
//                if(memberIdTemp==null || memberIdTemp.length()==0) {
//                    errors.put("memberId", "Please enter memberId for "+prodaction);
//                }
//            }
//        }
//
//        //根據Model執行結果導向View
//        if(prodaction!=null && prodaction.equals("Select")) {
//            List<MembersBean> result = membersService.select(bean);
//            model.setAttribute("select", result);
//            model.getRequestDispatcher(
//                    "/pages/displayMembersForm.jsp").forward(request, response);
//        } else if(prodaction!=null && prodaction.equals("提交")) {
//            MembersBean result = membersService.insert(bean);
//            if(result==null) {
//                errors.put("action", "Insert fail");
//            } else {
//                request.setAttribute("insert", result);
//            }
//            request.getRequestDispatcher(
//                    "/pages/register/registerForm.jsp").forward(request, response);
//        } else if(prodaction!=null && prodaction.equals("Update")) {
//            MembersBean result = membersService.update(bean);
//            if(result==null) {
//                errors.put("action", "Update fail");
//            } else {
//                request.setAttribute("update", result);
//            }
//            request.getRequestDispatcher(
//                    "/pages/register/registerForm.jsp").forward(request, response);
//        }else  {
//            errors.put("action", "Unknown Action:"+prodaction);
//            request.getRequestDispatcher(
//                    "/pages/register/registerForm.jsp").forward(request, response);
//        }
//    }
//
//
//


}
