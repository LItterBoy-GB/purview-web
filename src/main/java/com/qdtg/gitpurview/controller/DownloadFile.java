package com.qdtg.gitpurview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: git-purview
 * @description:
 * @author: JavaLitterBoy
 * @create: 2018-09-13 11:42
 **/
@Controller
public class DownloadFile {


    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/down/**")
    public void down_file(HttpServletRequest request, HttpServletResponse response){
       String path =  request.getRequestURI().substring(6);

    }

    @RequestMapping("/down_encode/**")
    public void down_encode_file(HttpServletRequest request, HttpServletResponse response){
        String path =  request.getRequestURI().substring(6);
    }
}
