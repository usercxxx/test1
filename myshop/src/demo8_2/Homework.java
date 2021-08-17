package demo8_2;


import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Homework {
   public static void main(String[] args) {
	List list= new ArrayList();
	list.add("���»�");
	list.add("��ѧ��");
	list.add("����");
	list.add("������");
	System.out.println("1.");
	System.out.println("��Listʵ�ֵ�");
	System.out.println("---------------");
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	Set set = new HashSet<>();
	set.add("���»�");
	set.add("��ѧ��");
	set.add("����");
	set.add("������");
	System.out.println();
	System.out.println("��Setʵ�ֵ�");
	System.out.println("---------------");
	for (int i = 0; i < set.size(); i++) {
		System.out.println(list.get(i));
	}
	
	
	list.add(0, "����");
	list.add(list.indexOf("��ѧ��"),"��С��");
	list.remove("��ѧ��");
	list.remove("����");
	list.add(list.indexOf("������"),"������");
	list.remove("������");
    System.out.println();
	System.out.println("2.��Listʵ�ֵ�");
	System.out.println("---------------");
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(list.size()-1-i));
	}
	
	
}
}
