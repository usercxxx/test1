package demo8_2;

public class TestLambda {
    public String chageValue(String str,ITestLam tl) {

        return tl.getValue(str);
    }
    public long js(long x,long y,ILiangge<Long, Long> la){
        return la.l(x, y);
    }
}
