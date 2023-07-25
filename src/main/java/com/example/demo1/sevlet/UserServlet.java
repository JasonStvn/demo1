package com.example.demo1.sevlet;

import com.example.demo1.dao.PageInfo;
import com.example.demo1.dao.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf8");
//        //默认当前页
//        int pageCurrent = 1;
//        //默认页行数
//        int pageSize = 10;
//        //获取入参的分页信息-当前页
//        String pageCurrentStr = request.getParameter("pageCurrent");
//        //如果该参数有值
//        if (pageCurrentStr != null && !pageCurrentStr.equals("")) {
//            //替换默认值
//            pageCurrent = Integer.parseInt(pageCurrentStr);
//        }
//        //获取入参的分页信息-页行数
//        String pageSizeStr = request.getParameter("pageSize");
//        //如果该参数有值
//        if (pageSizeStr != null && !pageSizeStr.equals("")) {
//            //替换默认值
//            pageSize = Integer.parseInt(pageSizeStr);
//        }
//
//        User user = new User();
//        String accountNo = request.getParameter("accountNo");
//        if (accountNo != null && !accountNo.equals("")) {
//            user.setAccountNo(accountNo);
//        }
//        String userName = request.getParameter("userName");
//        if (userName != null && !userName.equals("")) {
//            user.setUserName(userName);
//        }
//        String sexString = request.getParameter("sex");
//        if (sexString != null && !sexString.equals("")) {
//            user.setSex(Integer.parseInt(sexString));
//        }
//        //条件查询用户信息
//        UserService userService = new UserService();
//        List<User> userList =userService.queryUserList(user);
//
//        //总条数
//        int sumCounts = userList.size();
//        //总页数
//        int sumPages = sumCounts/pageSize + (sumCounts%pageSize==0?0:1);
//        //起始下标 0
//        int startIndex = (pageCurrent-1)*pageSize;
//        //结束下表 9
//        int endIndex = pageCurrent*pageSize-1;
//        //返回结果的用户信息
//        List<User> returnUserList = new ArrayList<>();
//        //如果查询结果不为空
//        if (userList.size() > 0) {
//            //获取分页范围内的数据
//            for (int i = 0; i < userList.size(); i++) {
//                if (i >= startIndex && i <= endIndex) {
//                    returnUserList.add(userList.get(i));
//                }
//            }
//        }
//        //封装分页信息并放入查询的分页结果
//        PageInfo<User> pageInfo = new PageInfo<User>();
//        pageInfo.setPageCurrent(pageCurrent);
//        pageInfo.setPageSize(pageSize);
//        pageInfo.setSumCounts(sumCounts);
//        pageInfo.setSumPages(sumPages);
////        pageInfo.setDataList(returnUserList);
//        //返回jsp页面的参数
//        request.setAttribute("pageInfo",pageInfo);
//        request.setAttribute("userList",returnUserList);
//        request.getRequestDispatcher("ShowUsers.jsp").forward(request, response);
    }
}
