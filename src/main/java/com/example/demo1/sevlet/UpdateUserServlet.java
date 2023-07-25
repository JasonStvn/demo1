package com.example.demo1.sevlet;

import com.example.demo1.dao.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateUserServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf8");

//        User user = new User();
//        String id = request.getParameter("id");
//        if (id == null || id.equals("")) {
//            request.setAttribute("errorMsg","id can not be null!");
//            response.sendRedirect("ShowUsers.jsp");
//            request.getRequestDispatcher("ShowUsers.jsp").forward(request, response);
//            return;
//        }
//        String roleId = request.getParameter("roleId");
//        if (roleId != null && !roleId.equals("")) {
//            user.setAccountNo(roleId);
//        }
//        String accountNo = request.getParameter("accountNo");
//        if (accountNo != null && !accountNo.equals("")) {
//            user.setAccountNo(accountNo);
//        }
//        String userName = request.getParameter("userName");
//        if (accountNo != null && !accountNo.equals("")) {
//            user.setAccountNo(accountNo);
//        }
//        String sex = request.getParameter("sex");
//        if (accountNo != null && !accountNo.equals("")) {
//            user.setAccountNo(accountNo);
//        }
//        String phone = request.getParameter("phone");
//        if (accountNo != null && !accountNo.equals("")) {
//            user.setAccountNo(accountNo);
//        }


//
//        UserService userService = new UserService();
//        String id = request.getParameter("id");
//        if (id != null && !id.equals("")) {
//            UserVO user = userService.viewUser(Integer.parseInt(id));
//            if (user != null) {
//                request.setAttribute("user",user);
//                request.getRequestDispatcher("UpdateUser.jsp").forward(request, response);
//                return;
//            } else {
//                request.setAttribute("errorMsg","this id not exit!");
//            }
//        } else {
//            request.setAttribute("errorMsg","id can not be null!");
//        }
//
//        List<User> userList =userService.queryUserList(new User());
//        request.setAttribute("userList",userList);
//        request.getRequestDispatcher("ShowUsers.jsp").forward(request, response);
    }
}
