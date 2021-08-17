package com.text8_5.dao.Impl;

import com.text8_5.dao.GoodDao;
import com.text8_5.util.good;
import com.text8_5.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public  class Goodaoimpl implements GoodDao {

	@Override
	public int add(String name,float price) {
	     PreparedStatement ps = null;
	     Connection con= DBUtil.con();
     try {
		
			String sql ="insert into product (productName,price) values (?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setFloat(2, price);
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
	public int delete(int id) {
		 Connection con= DBUtil.con();
	     PreparedStatement ps = null;
     try {
		
			String sql ="delete from product where productId=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,id);
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
	public void show() {
		Connection con= DBUtil.con();
	     PreparedStatement ps = null;
	     ResultSet rs = null;
     try {
		
    	 String sql ="select * from product";
    	 ps = con.prepareStatement(sql);
    	 rs=ps.executeQuery();
 		 while(rs.next()){
 			System.out.print(rs.getInt(1)+"\t");
 			System.out.print(rs.getString(2)+"\t");
 			System.out.print(rs.getString(3)+"\t");
 			System.out.print(rs.getInt(4)+"\t");
 			System.out.print(rs.getString(5)+"\t");
 			System.out.println();
 		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(con, ps, null);
		}
		
	}



	@Override
	public int change(good stu) {
	     PreparedStatement ps = null;
	     Connection con = DBUtil.con();;
     try {
		
    	    String sql ="update product set price =?, productName=?  where productId=?";
			ps = con.prepareStatement(sql);
			ps.setFloat(1,stu.getPrice());
			ps.setString(2,stu.getProductName());
			ps.setInt(3,stu.getProductId());
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



}
