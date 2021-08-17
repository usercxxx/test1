package com.google.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;
    private String gender;

    public User() {
    }
    public User(String name, String password, String gender) {
        this.name = name;
        this.password = password;
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", filename='" + password + '\'' +
                ", gender=" + gender +
                '}';
    }
}
