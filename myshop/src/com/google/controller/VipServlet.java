package com.google.controller;

import com.google.dao.impi.VipDaoIpml;
import com.google.entity.User;
import com.google.service.VipService;
import com.google.service.impl.VipServiceIpml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class VipServlet extends HttpServlet {
    private VipService vipService = new VipServiceIpml();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        String gender=req.getParameter("gender");
        System.out.println(name);
        User user = new User(name, password, gender);
        int p= vipService.save(user);
        PrintWriter out = resp.getWriter();
//        out.write("dd");
//        out.println("35345");

        VipDaoIpml vipDaoIpml = new VipDaoIpml();
        out.println(vipDaoIpml.getP());
        if (p!=0){
            resp.addHeader("content-type","text/plain;charset=utf-8");
//            PrintWriter writer = resp.getWriter();
//            writer.write("yes");
//            writer.flush();
//            writer.close();
             resp.sendRedirect("index.html");
//            rd.forward(req, resp);
        }
    }
}
