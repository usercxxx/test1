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
		System.out.println("< < < < < < ����Աϵͳ > > > > > >");
		System.out.println("1. �ͻ���Ϣ���� \n2. ��Ʒ��Ϣ����\n3. ������Ϣ����\n4. �˳�\n��ѡ���ܣ�1��2��3,4����  ");
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

		System.out.println("< < < < < < ����Աϵͳ > > > > > >");
		System.out.println("1. �ͻ���Ϣ���� \n2. ��Ʒ��Ϣ����\n3. ������Ϣ����\n4. �˳�\n��ѡ���ܣ�1��2��3,4����  ");
		nub = backInt();
	  }
	}



	/*
	 *�û�������
	 * */
	public void userManage(){
		 System.out.println("1. ��ʾ�����û���Ϣ \n2. ����û���Ϣ\n3. �޸��û���Ϣ\n4. ɾ���û���Ϣ\n5.������һ��\n��ѡ���ܣ�1��2��3,4,5) ��  ");
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
			 System.out.println("< < < < < < ����Աϵͳ > > > > > >");
			 System.out.println("1. ��ʾ�����û���Ϣ \n2. ����û���Ϣ\n3. �޸��û���Ϣ\n4. ɾ���û���Ϣ\n5.������һ��\n��ѡ���ܣ�1��2��3,4,5) ��  ");
			 nub= backInt();
	     }
	}

	/*
	 *��Ʒ������
	 * */
	 public void goodManage(){
		 System.out.println("1. ��ʾ������Ʒ��Ϣ \n2. �����Ʒ��Ϣ\n3. �޸���Ʒ��Ϣ\n4. ɾ����Ʒ��Ϣ\n5.������һ��\n��ѡ���ܣ�1��2��3,4,5) ��  ");
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
			 System.out.println("< < < < < < ����Աϵͳ > > > > > >");
			 System.out.println("1. ��ʾ������Ʒ��Ϣ \n2. �����Ʒ��Ϣ\n3. �޸���Ʒ��Ϣ\n4. ɾ����Ʒ��Ϣ\n5.������һ��\n��ѡ���ܣ�1��2��3,4,5) ��  ");
			 nub= backInt();
		 }
	 }

	/*
	 *��Ʒ����
	 * */
	private void goodUpdata() {
		System.out.println("�����������޸���Ʒ��ID��");
		int id=scanner.nextInt();
		System.out.println("�������޸ĺ���Ʒ������");
		String productName=scanner.next();
		System.out.println("�������޸ĺ���Ʒ�ļ۸�");
		float price=scanner.nextFloat();
		good stu=new good(id,productName,price);

		if (goods.change(stu)>0) {
			System.out.println("�޸ĳɹ�");
		}else {
			System.out.println("�޸�ʧ��");
		}
	}
	public void goodAdd() {
		System.out.println("��������Ʒ���ƣ�");
		String name=scanner.next();
		System.out.println("��������Ʒ�۸�");
		float p=scanner.nextFloat();
		goods.add(name,p);
		System.out.println("���ѧ���ɹ���");
	}
	public void goodsseeNews() {
		System.out.println("=========================");
		goods.show();
		System.out.println("=========================");
	}

	public void goodsDelete(){
		int id;
		boolean t =true;
		System.out.println("������ѧ��id��");
		id=backInt();
		int sum = goods.delete(id);
		while (sum>0) {
			System.out.println("ɾ���ɹ�");
			t=false;
			break;
		}

		if (t) {
			System.out.println("û���������id");
		}
	}

     /*
     *�û�����
     * */

	private void updata() {
		System.out.println("�����������޸�ѧ����ID��");
		String id=scanner.next();
		System.out.println("�������޸ĺ�ѧ��������");
		String name=scanner.next();
		System.out.println("�������޸ĺ�ѧ��������");
		String pwd=scanner.next();
		User stu=new User(id,pwd,name);
		if (ts.change(stu)>0) {
			System.out.println("�޸ĳɹ�");
		}else {
			System.out.println("�޸�ʧ��");
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
		System.out.println("������ѧ��id��");
		id=backInt();
		int sum = ts.delete(id);
		while (sum>0) {
			System.out.println("ɾ���ɹ�");
			t=false;
			break;
		}

		if (t) {
			System.out.println("û���������id");
		}
	}

	public void addNews() {
		System.out.println("������ѧ����Ա�ţ�");
		String name=scanner.next(); 
		System.out.println("������ѧ��������");
		String age=scanner.next();
		System.out.println("������ѧ�����룺");
		String id=scanner.next();
		ts.add(name, age,id);
		System.out.println("���ѧ���ɹ���");
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
   				System.out.println("����������");
   			}
   		}
		  return id;
	}
}
  
