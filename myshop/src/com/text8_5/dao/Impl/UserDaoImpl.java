package com.text8_5.dao.Impl;

import com.text8_5.dao.UserDao;
import com.text8_5.util.DBUtil;
import com.text8_5.util.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public int update(User user) {
        PreparedStatement ps = null;
        Connection con = DBUtil.con();;
        try {

            String sql ="update customer set customerPwd=?   ,balance=? where customerName=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,user.getCustomerPwd());
            ps.setString(3,user.getCustomerName());
            ps.setFloat(2,user.getBalance());
            int n=ps.executeUpdate();
            return n;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            DBUtil.close(con, ps, null);
        }
        return 0;
    }

    @Override
    public float see(User user) {
        Connection con= DBUtil.con();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String sql ="select balance from customer where customerName=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,user.getCustomerName());
            rs=ps.executeQuery();
            while(rs.next()){
               return rs.getFloat(1);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            DBUtil.close(con, ps, rs);
        }
        return 0;
    }


}
