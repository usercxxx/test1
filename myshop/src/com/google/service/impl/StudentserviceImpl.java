package com.google.service.impl;

import com.google.dao.impi.StudentDaoImpl;
import com.google.entity.User;
import com.google.service.StudentService;

import java.util.List;

public class StudentserviceImpl implements StudentService {
   private StudentDaoImpl stu =new StudentDaoImpl();
    @Override
    public List<User> listStudents() {
        return stu.show();
    }

    @Override
    public int deleteStu(String stuNub) {
        return stu.deleteStu(stuNub);
    }
}
