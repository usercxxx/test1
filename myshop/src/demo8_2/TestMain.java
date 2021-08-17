package demo8_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMain {
    TestLambda tl= new  TestLambda();
    List<Employee> emps= Arrays.asList(
            new Employee("张三",13),
            new Employee("东方",23),
            new Employee("小明",25),
            new Employee("丰都",42),
            new Employee("王五",23));
    @Test
    public void test1(){
        Collections.sort(emps,(x,y)->{
               if (x.getAge()==y.getAge()){
                     return x.getName().compareTo(y.getName());
               }else {
                   return Integer.compare(x.getAge(),y.getAge());

               }
        });
        for (Employee employee: emps) {
            System.out.println(employee);
        }
    }
   @Test
    public void test2(){
        String big=tl.chageValue("dfasdf",(x)->{
            return x.toUpperCase();
        });
        System.out.println(big);
        String select=tl.chageValue("fsaffa",(x)->{
            return x.substring(1,4);
        });
        System.out.println(select);
    }
@Test
   public void test3(){
        long add=tl.js(10,5,(x,y)->{
            return x+y;
        });
       System.out.println(add);
       long multiply=tl.js(30,3,(x,y)->{
           return x*y;
       });
       System.out.println(multiply);
   }
}
