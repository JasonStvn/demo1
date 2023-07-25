package com.example.demo1.sevlet;

import com.example.demo1.dao.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserDeleteServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf8");

//        UserService userService = new UserService();
//        try {
//            String id = request.getParameter("id");
//            if (id == null) {
//                request.setAttribute("errorMsg","id can not be null!");
//                return;
//            }
//            int n = userService.deleteById(Integer.parseInt(id));
//            if (n != 1) {
//                request.setAttribute("errorMsg","delete user by id fail!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            List<User> userList = userService.queryUserList(new User());
//            request.setAttribute("userList",userList);
//            request.getRequestDispatcher("ShowUsers.jsp").forward(request, response);
//        }
    }
}
