package com.google.dao.impi;

import com.google.dao.VipDao;
import com.google.entity.User;

import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VipDaoIpml extends BaseDaoImpI implements VipDao {
    int p = 0;
    @Override
    public int save(User user) {
        String  sql ="insert into user (name,password,gender) values(?,?,?)";
        Connection connection =null;
        PreparedStatement ps =null;
        try {
            connection =getconnection();
            ps  =connection.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getGender());
             p= ps.executeUpdate();
            System.out.println(p);
            return p;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeAll(connection,ps,null);
        }

        return p;
    }

    @Override
    public List<User> findUser(String name) {
        String  sql ="select *from user where name =?";
        Connection connection =null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();
        try {
            connection =getconnection();
            ps  =connection.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setName(rs.getString("name"));
                user.setGender(rs.getString("gender"));
                user.setPassword(rs.getString("password"));
                users.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeAll(connection,ps,rs);
        }
        return users;
    }

    @Override
    public boolean login(String name, String password) {
        String  sql ="select *from user where name=? && password=?";
        Connection connection =null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();
        try {
            connection =getconnection();
            ps  =connection.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,password);
            rs = ps.executeQuery();
            while(rs.next()) {
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeAll(connection,ps,rs);
        }
        return false;
    }

    public int getP() {
        return p;
    }
}
