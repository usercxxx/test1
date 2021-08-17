package com.google.service;

import com.google.entity.User;

import java.util.List;

public interface StudentService {
    List<User> listStudents();

    int deleteStu(String stuNub);
}
