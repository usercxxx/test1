package demo8_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class ArrayListText {
   public static void main(String[] as) {
	ArrayList<Integer> list = new ArrayList<Integer>();
//	list.add("c");
	list.add(3);
	list.add(13);
	list.add(3);
	list.add(7);
	list.addAll(list);
	Collections.sort(list);
	for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i)+"\t");
	}
	 

}
}
