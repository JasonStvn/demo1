package com.example.demo1.sevlet;

import com.example.demo1.dao.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserStatusServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf8");

//        String id = request.getParameter("id");
//        if (id == null || id.equals("")) {
//            request.setAttribute("errorMsg","id can not be null!");
//            request.getRequestDispatcher("ShowUsers.jsp").forward(request, response);
//            return;
//        }
//        String status = request.getParameter("status");
//        if (status == null || status.equals("")) {
//            request.setAttribute("errorMsg","status can not be null!");
//            request.getRequestDispatcher("ShowUsers.jsp").forward(request, response);
//            return;
//        }
//
//        User user = new User();
//        user.setId(Integer.parseInt(id));
//        Integer iStatus = Integer.parseInt(status);
//        if (iStatus.equals(0)) {
//            user.setStatus(1);
//        } else {
//            user.setStatus(0);
//        }
//
//        UserService userService = new UserService();
//        int n = userService.updateStatus(user);
//        if (n > 1) {
//            throw new RuntimeException("999999!");
//        } else if (n == 0) {
//            request.setAttribute("errorMsg","status is this value!");
//            request.getRequestDispatcher("ShowUsers.jsp").forward(request, response);
//        } else {
//            user = new User();
//            List<User> userList =userService.queryUserList(user);
//            request.setAttribute("userList",userList);
//            request.getRequestDispatcher("ShowUsers.jsp").forward(request, response);
//        }
    }
}
