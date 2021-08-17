package com.text8_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.text8_5.dao.Impl.Goodaoimpl;
import com.text8_5.dao.Impl.Testdaoimpl;
import com.text8_5.util.User;
import com.text8_5.util.good;

public   class TestMain {
	static Scanner scanner = new Scanner(System.in);
	static List<good> nList = new ArrayList<>();
	static Testdaoimpl ts = new Testdaoimpl();
	static Goodaoimpl goods = new Goodaoimpl();

	public static void main() {
		System.out.println("< < < < < < 管理员系统 > > > > > >");
		System.out.println("1. 客户信息管理 \n2. 商品信息管理\n3. 购物信息管理\n4. 退出\n请选择功能（1，2，3,4）：  ");
		int nub = backInt();
		TestMain tm = new TestMain();
		while (nub != 4) {
			if (nub == 1) {
				tm.userManage();
			} else if (nub == 2) {
				tm.goodManage();
			} else if (nub == 3) {
//				tm.deleteNews();
			}

		System.out.println("< < < < < < 管理员系统 > > > > > >");
		System.out.println("1. 客户信息管理 \n2. 商品信息管理\n3. 购物信息管理\n4. 退出\n请选择功能（1，2，3,4）：  ");
		nub = backInt();
	  }
	}



	/*
	 *用户管理方法
	 * */
	public void userManage(){
		 System.out.println("1. 显示所有用户信息 \n2. 添加用户信息\n3. 修改用户信息\n4. 删除用户信息\n5.返回上一级\n请选择功能（1，2，3,4,5) ：  ");
		 int nub= backInt();
		 TestMain tm = new TestMain();
		 while (nub!=5) {
			 if (nub==1) {
				 seeNews();
			 }else  if(nub==2){
				 tm.addNews();
			 }else  if (nub==4) {
				 tm.deleteNews();
			 }else if (nub==3){
				 tm.updata();
			 }
			 System.out.println("< < < < < < 管理员系统 > > > > > >");
			 System.out.println("1. 显示所有用户信息 \n2. 添加用户信息\n3. 修改用户信息\n4. 删除用户信息\n5.返回上一级\n请选择功能（1，2，3,4,5) ：  ");
			 nub= backInt();
	     }
	}

	/*
	 *商品管理方法
	 * */
	 public void goodManage(){
		 System.out.println("1. 显示所有商品信息 \n2. 添加商品信息\n3. 修改商品信息\n4. 删除商品信息\n5.返回上一级\n请选择功能（1，2，3,4,5) ：  ");
		 int nub= backInt();
		 TestMain tm = new TestMain();
		 while (nub!=5) {
			 if (nub==1) {
				 goodsseeNews();
			 }else  if(nub==2){
				 goodAdd();
			 }else  if (nub==3) {
				goodUpdata();
			 }else if (nub==4){
				 goodsDelete();
			 }
			 System.out.println("< < < < < < 管理员系统 > > > > > >");
			 System.out.println("1. 显示所有商品信息 \n2. 添加商品信息\n3. 修改商品信息\n4. 删除商品信息\n5.返回上一级\n请选择功能（1，2，3,4,5) ：  ");
			 nub= backInt();
		 }
	 }

	/*
	 *商品方法
	 * */
	private void goodUpdata() {
		System.out.println("请输入你想修改商品的ID：");
		int id=scanner.nextInt();
		System.out.println("请输入修改后商品的姓名");
		String productName=scanner.next();
		System.out.println("请输入修改后商品的价格");
		float price=scanner.nextFloat();
		good stu=new good(id,productName,price);

		if (goods.change(stu)>0) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
	}
	public void goodAdd() {
		System.out.println("请输入商品名称：");
		String name=scanner.next();
		System.out.println("请输入商品价格：");
		float p=scanner.nextFloat();
		goods.add(name,p);
		System.out.println("添加学生成功！");
	}
	public void goodsseeNews() {
		System.out.println("=========================");
		goods.show();
		System.out.println("=========================");
	}

	public void goodsDelete(){
		int id;
		boolean t =true;
		System.out.println("请输入学生id：");
		id=backInt();
		int sum = goods.delete(id);
		while (sum>0) {
			System.out.println("删除成功");
			t=false;
			break;
		}

		if (t) {
			System.out.println("没有你输入的id");
		}
	}

     /*
     *用户方法
     * */

	private void updata() {
		System.out.println("请输入你想修改学生的ID：");
		String id=scanner.next();
		System.out.println("请输入修改后学生的姓名");
		String name=scanner.next();
		System.out.println("请输入修改后学生的密码");
		String pwd=scanner.next();
		User stu=new User(id,pwd,name);
		if (ts.change(stu)>0) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
	}

	public void seeNews() {
		System.out.println("=========================");
		ts.show();
		System.out.println("=========================");
	}

	public void deleteNews(){
		int id;
		boolean t =true;
		System.out.println("请输入学生id：");
		id=backInt();
		int sum = ts.delete(id);
		while (sum>0) {
			System.out.println("删除成功");
			t=false;
			break;
		}

		if (t) {
			System.out.println("没有你输入的id");
		}
	}

	public void addNews() {
		System.out.println("请输入学生会员号：");
		String name=scanner.next(); 
		System.out.println("请输入学生姓名：");
		String age=scanner.next();
		System.out.println("请输入学生密码：");
		String id=scanner.next();
		ts.add(name, age,id);
		System.out.println("添加学生成功！");
	}


	public static boolean isNumer(String str){
		for(int i=str.length();--i>=0;){
			int chr=str.charAt(i);
			if(chr<48 || chr>57){
				return false;
			}
		}
		return true;
	}
	public static int backInt() {
		int id;
		while (true) {
   			String str =scanner.next();
   			if (TestMain.isNumer(str)) {
   				id =Integer.parseInt(str);
   				break;
   			} else {
   				System.out.println("请输入数字");
   			}
   		}
		  return id;
	}
}
  
