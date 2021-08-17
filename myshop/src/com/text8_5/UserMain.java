package com.text8_5;

import com.text8_5.dao.Impl.Goodaoimpl;
import com.text8_5.dao.Impl.Testdaoimpl;
import com.text8_5.dao.Impl.UserDaoImpl;
import com.text8_5.dao.UserDao;
import com.text8_5.util.Login;
import com.text8_5.util.User;
import com.text8_5.util.good;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public   class UserMain {
      static Scanner scanner =new Scanner(System.in);
      static List<good> nList =new ArrayList<>();
      static Testdaoimpl ts  = new Testdaoimpl();
      static Goodaoimpl goodaoimpl = new Goodaoimpl();
      static UserDao us=new UserDaoImpl();
       public static void  main()  {
        System.out.println("< < < < < < 用户管理系统 > > > > > >");
        System.out.println("1. 看商品 \n2. 购物\n3. 充值\n4. 修改密码\n5.退出\n 请选择功能:  ");
        int nub= backInt();
        UserMain tm = new UserMain();
        while (nub!=6) {
          if (nub==1) {
           tm.seeNews();
          }else  if(nub==2){
           tm.buy();
          }else  if (nub==3) {
            tm.updateBalance();
          }else if (nub==4){
           tm.updataPassword();
         }
            System.out.println("< < < < < < 用户管理系统 > > > > > >");
            System.out.println("1. 看商品 \n2. 购物\n3. 充值\n4. 修改密码\n5.退出\n 请选择功能:  ");
          nub= backInt();
        }
   }
   private void updataPassword() {
       System.out.println("请输入你想更改的密码");
       String password=scanner.next();
       Login login=new Login();
       float lodMoney=us.see(login.getUser1());
       login.getUser1().setBalance(lodMoney);
       login.getUser1().setCustomerPwd(password);
       us.update(login.getUser1());
   }
    public void buy() {
       System.out.println("请输入你想购买商品的id");
       int id=backInt();
        Login login=new Login();
       ts.buy(login.getUser1(),id);

   }

   public void seeNews() {
       System.out.println("=========================");
        goodaoimpl.show();
       System.out.println("=========================");
   }

      public void updateBalance(){
          System.out.println("请输入你想充值的金额");
          float money=scanner.nextFloat();
          System.out.println("扫码支付");
          Login login=new Login();
          float lodMoney=us.see(login.getUser1());
          login.getUser1().setBalance(money+lodMoney);
          us.update(login.getUser1());
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
              if (UserMain.isNumer(str)) {
                  id =Integer.parseInt(str);
                  break;
              } else {
                  System.out.println("??????????");
              }
          }
         return id;
   }
}
  
