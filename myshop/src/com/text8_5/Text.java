package com.text8_5;

import java.io.IOException;

import com.text8_5.util.Login;
import com.text8_5.util.User;


public class Text {



	public static void main(String[] args) throws IOException {
    	 System.out.println("**********************************\n" +
				            "*                                *\n" +
				            "*      ��ӭʹ�������ഺ����ϵͳ       *\n" +
				            "*                                *\n" +
				            "**********************************");
   	    String user =  Login.main();

   	    if (user.equals("admin")){
			TestMain.main();
		}else {
			UserMain.main();
		}


//   	     System.out.println("*****************��¼�ɹ�*****************");

    	 
    	 
    	
	}
}
