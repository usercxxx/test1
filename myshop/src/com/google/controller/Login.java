package com.google.controller;

import com.google.dao.impi.VipDaoIpml;
import com.google.service.impl.VipServiceIpml;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
     VipDaoIpml vipDaoIpml= new VipDaoIpml();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("password");
//        System.out.println(111);
        System.out.println(name+pwd);
        boolean flag = vipDaoIpml.login(name,pwd);
        if (flag){
            resp.sendRedirect(req.getContextPath()+"/list.do");
        }else {

            PrintWriter writer = resp.getWriter();

            writer.write("<script>window.alert('2221 2w11wwss为dsd是');</script>");
//            resp.sendRedirect("index.html");
            writer.flush();
            writer.close();


        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
