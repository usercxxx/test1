package com.text8_5;

import java.io.IOException;

import com.text8_5.util.Login;
import com.text8_5.util.User;


public class Text {



	public static void main(String[] args) throws IOException {
    	 System.out.println("**********************************\n" +
				            "*                                *\n" +
				            "*      欢迎使用迷你青春购物系统       *\n" +
				            "*                                *\n" +
				            "**********************************");
   	    String user =  Login.main();

   	    if (user.equals("admin")){
			TestMain.main();
		}else {
			UserMain.main();
		}


//   	     System.out.println("*****************登录成功*****************");

    	 
    	 
    	
	}
}
