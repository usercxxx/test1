package demo8_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class TestNews {
	
	 static ArrayList<NewsInfo> nList =new ArrayList<>();
	public static void main(String[] args) {
         System.out.println("< < < < < < ???ArrayList???????????? > > > > > >");
         System.out.println("1. ??????? \n2. ???????\n3. ???????\n????????1??2??3,4???????  ");

         Scanner scanner =new Scanner(System.in);
         int nub =scanner.nextInt();
         int i=0;
        NewsInfo n= new  NewsInfo();
     
         while (nub!=4) {
        
        
         if (nub==2) {
        	System.out.println(i);
        	nList.add(n);
			System.out.println("?????????????");
			 nList.get(i).setNewsId(scanner.nextInt());
			 System.out.println(nList.get(i).getNewsId());
			System.out.println("?????????????");
			 nList.get(i).setNewsTitle(scanner.next());
			System.out.println("???????????????");
			 nList.get(i).setNewsContent(scanner.next());
			System.out.println("???????????");
			System.out.println(nList.size());
		
			i++;
	     }else  if(nub==1){
	    	 Iterator iter =nList.iterator();
			System.out.println("ArrayList???????????????");
			System.out.println("=========================");
			System.out.println("???\t????\t\t????");
			for (int j = 0; j < i; j++) {
					System.out.println(nList.get(j).getNewsId());
			}
		    while (iter.hasNext()) {
			        NewsInfo n1=(NewsInfo) iter.next();
					System.out.println(n1.getNewsId()+"\t"+n1.getNewsTitle()+"\t\t"+n1.getNewsContent());
			}
		
			System.out.println("=========================");
		     }
         
         System.out.println("1. ??????? \n2. ???????\n3. ???????\n????????1??2??3,4???????  ");

         nub =scanner.nextInt();
	    }
	} 
	public void addNews() {
		
	}
       public void deleteNews() {
	 	
	}
}
  
