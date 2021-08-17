package com.text8_5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {
	public static final String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
	public static final String user = "root";
	public static final String pwd = "123456";
    static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static Connection con() {
    	 try {
			return  DriverManager.getConnection(url,user,pwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return null;
	}
    
    public static void close(Connection con ,PreparedStatement ps,ResultSet rs ){
    	try {
		   if (ps!=null) {ps.close();}	
		   if (con!=null) {con.close();}	
		   if (rs!=null) {rs.close();}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
}
