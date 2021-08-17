package com.google.controller;

import com.google.service.VipService;
import com.google.service.impl.VipServiceIpml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/checkUser.do")
public class CheckUser extends HttpServlet {
    private VipService vipService = new VipServiceIpml();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        boolean flag = vipService.checkUser(name);
        
        resp.addHeader("content-type","text/plain;charset=utf-8");
        PrintWriter writer = resp.getWriter();
//        System.out.println(111);
        if(flag){
            writer.write("1");
        }else {
            writer.write("yes");
        }
        writer.flush();
        writer.close();
    }
}
