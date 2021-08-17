package com.google.controller;

import com.google.service.StudentService;
import com.google.service.impl.StudentserviceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/delete.do")
public class DeletSerlet extends HttpServlet {
    private StudentService studentService=new StudentserviceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stuNub=req.getParameter("no");
        System.out.println(stuNub);
        int res=studentService.deleteStu(stuNub);
        resp.sendRedirect(req.getContextPath()+"/list.do");
    }
}
