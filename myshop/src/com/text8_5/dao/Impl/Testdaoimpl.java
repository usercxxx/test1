package com.text8_5.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.text8_5.Text;
import com.text8_5.util.User;
import com.text8_5.dao.IUserDao1;
import com.text8_5.util.DBUtil;

public  class  Testdaoimpl implements IUserDao1{

	@Override
	public int add(String Nob,String name,String pwd) {
	     PreparedStatement ps = null;
	     Connection con= DBUtil.con();
     try {

			String sql ="insert into customer (customerNob ,customerName,customerPwd) values (?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, Nob);
			ps.setString(2, name);
			ps.setString(3, pwd);
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
		
			String sql ="delete from customer where customerId=?";
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
		
    	 String sql ="select customerId, customerNob,customerName,customerPwd from customer";
    	 ps = con.prepareStatement(sql);
    	 rs=ps.executeQuery();
 		 while(rs.next()){
			 System.out.print(rs.getInt(1)+"\t");
 			System.out.print(rs.getString(2)+"\t");
 			System.out.print(rs.getString(3)+"\t");
 			System.out.print(rs.getString(4)+"\t");
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
	public int buy(User user,int id) {
		Connection con= DBUtil.con();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {

			String sql ="SELECT price,number,SUM(price)-price as  balance ,sum(number)-number as score FROM(" +
					"  select price,number from  product p WHERE productId=?" +
					"  UNION all"+
					"  select balance,score   from customer c WHERE customerName=?)a";

			ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			ps.setString(2,user.getCustomerName());
			rs=ps.executeQuery();
//			System.out.println(111);
//			System.out.println(rs.getFloat(1));
			//余额
			while (rs.next()) {
				float f1 = rs.getFloat(1);
				int number = rs.getInt(2);
				//积分
				int sroce = rs.getInt(4);
				float fl = rs.getFloat(3)-f1;

				if (fl < 0) {
					System.out.println("余额不足");
				} else if (number < 0) {
					System.out.println("已经卖完");
				} else {
					String sql1 = "update product,customer set customer.balance=?,product.number=?, customer.score=? where customerName=?&&productId=?";

					ps = con.prepareStatement(sql1);
					ps.setFloat(1, fl);
					ps.setInt(2, number - 1);

					ps.setInt(3, sroce + 5);
					ps.setString(4, user.getCustomerName());
					ps.setInt(5, id);
					ps.executeUpdate();
					System.out.println("添加成功");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(con, ps, rs);
		}
     return 0;
	}


	@Override
	public int change(User stu) {
	     PreparedStatement ps = null;
	     Connection con = DBUtil.con();;
     try {
		
    	    String sql ="update customer set customerPwd=?  , customerName=?  where customerId=?";
			ps = con.prepareStatement(sql);
			ps.setString(1,stu.getCustomerPwd());
			ps.setString(2,stu.getCustomerName());
			ps.setString(3,stu.getCustomerNo());
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
	public boolean login(User stu) {
		 Connection con= DBUtil.con();
	     PreparedStatement ps = null;
	     ResultSet rs = null;
	    try {
			
	   	 String sql ="select *from customer where customerName=? &&customerPwd=?";
	   	 ps = con.prepareStatement(sql);
	   	ps.setString(1,stu.getCustomerName());
	   	ps.setString(2,stu.getCustomerPwd());
//			System.out.println(stu.getCustomerName()+stu.getCustomerPwd());
	   	 rs=ps.executeQuery();
		 while(rs.next()){
			 return true;
//			if (rs.getString(1).equals(stu.getcustomerName())&&rs.getInt(2)==stu.getuser_pwd()) {
//				
//				return true;
//				
//			}
		 }
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }finally {
			DBUtil.close(con, ps, null);
		 }
	    return false;
	}

}
