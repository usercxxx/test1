package com.google.controller;

import com.google.entity.User;
import com.google.service.StudentService;
import com.google.service.impl.StudentserviceImpl;


import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/list.do")
public class Student extends HttpServlet {
    private StudentService studentservice =new StudentserviceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

          List<User> users = studentservice.listStudents();
          req.setAttribute("users",users);

          req.getRequestDispatcher("/WEB-INF/pages/user.jsp").forward(req,resp);
    }
}
