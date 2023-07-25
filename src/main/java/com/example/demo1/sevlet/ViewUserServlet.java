package com.example.demo1.sevlet;

import com.example.demo1.dao.entity.User;
import com.example.demo1.dao.vo.UserVO;
import com.example.demo1.service.UserService;
import com.example.demo1.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewUserServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf8");

//        UserService userService = new UserServiceImpl();
//        String id = request.getParameter("id");
//        if (id != null && !id.equals("")) {
//            UserVO userVO = userService.viewUser(Integer.parseInt(id));
//            if (userVO != null) {
//                request.setAttribute("user",userVO);
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
