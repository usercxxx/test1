package com.text8_5.util;

import java.io.IOException;
import java.util.Scanner;

import com.text8_5.Text;
import com.text8_5.dao.Impl.Testdaoimpl;

public class Login {
	private static User user1;

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public static String main() throws IOException {
//
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入用户名:");
			String user = scanner.nextLine();
			System.out.print("请输入密码:");
			String pwd = scanner.next();
			User user1 = new User(user, pwd);
			Login login=new Login();
			login.setUser1(user1);
			Testdaoimpl ts = new Testdaoimpl();
//			System.out.println(user+pwd);
			boolean flog = ts.login(user1);
			if (flog) {
				return user;

			} else {
				System.out.println("用户名或者密码输入错误");
			}

		}
	}
}
