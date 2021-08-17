package com.google.dao.impi;

import com.google.dao.StudnetDao;
import com.google.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends BaseDaoImpI implements StudnetDao {
    @Override
    public List<User> show() {
        String  sql ="select *from user ";
        Connection connection =null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();
        try {
            connection =getconnection();
            ps  =connection.prepareStatement(sql);

            rs = ps.executeQuery(sql);
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

    public int deleteStu(String stuNub) {
        String  sql ="delete from user where name=?";
        Connection connection =null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();
        try {
            connection =getconnection();
            ps  =connection.prepareStatement(sql);
            ps.setString(1,stuNub);

            return  ps.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeAll(connection,ps,rs);
        }
        return 0;
    }
}
