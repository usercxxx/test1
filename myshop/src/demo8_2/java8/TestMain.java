package demo8_2.java8;

import org.junit.Test;

import java.io.PrintStream;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class TestMain {
    @Test
    public void test1(){
       PrintStream ps=System.out;
       Consumer<String> con = (str)-> ps.println(str);
       con.accept("df");
    }
    @Test
    public void test2(){
        BiFunction<Integer,Integer,Integer> bf=(x, y)->Math.min(x,y);
        System.out.println(bf.apply(11,33));
        BiFunction<Integer,Integer,Integer> bf1=Math::min;
        System.out.println(bf.apply(11,33));

    }
}
