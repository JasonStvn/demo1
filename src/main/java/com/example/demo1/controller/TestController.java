package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    public ModelAndView getAll(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        //默认放request域
        modelAndView.addObject("","");
        //视图
        modelAndView.setViewName("list");

        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/getList1")
    public String getList1( HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        //默认放request域
        modelAndView.addObject("","");
        //视图
        modelAndView.setViewName("list");
        response.sendRedirect("");
        return null;
    }

    @RequestMapping("/upload")
    public String getList1(MultipartFile fileupload){
        String filename = fileupload.getOriginalFilename();
        try {
            fileupload.transferTo(new File("d:/upload/" + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    // http://localhost:8080/upload?id=1
    @RequestMapping("/upload/{id}")
    public String getList2(int id, MultipartFile fileupload){
        String filename = fileupload.getOriginalFilename();
        try {
            fileupload.transferTo(new File("d:/upload/" + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public Map<String,String> test1(String userName,String password){
        System.out.println(userName);
        System.out.println(password);
        Map<String,String> map = new HashMap<>();
        map.put("雪碧","123");
        map.put("矿泉水","2元");
        return map;
    }
}
