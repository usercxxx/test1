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
        System.out.println("< < < < < < �û�����ϵͳ > > > > > >");
        System.out.println("1. ����Ʒ \n2. ����\n3. ��ֵ\n4. �޸�����\n5.�˳�\n ��ѡ����:  ");
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
            System.out.println("< < < < < < �û�����ϵͳ > > > > > >");
            System.out.println("1. ����Ʒ \n2. ����\n3. ��ֵ\n4. �޸�����\n5.�˳�\n ��ѡ����:  ");
          nub= backInt();
        }
   }
   private void updataPassword() {
       System.out.println("������������ĵ�����");
       String password=scanner.next();
       Login login=new Login();
       float lodMoney=us.see(login.getUser1());
       login.getUser1().setBalance(lodMoney);
       login.getUser1().setCustomerPwd(password);
       us.update(login.getUser1());
   }
    public void buy() {
       System.out.println("���������빺����Ʒ��id");
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
          System.out.println("�����������ֵ�Ľ��");
          float money=scanner.nextFloat();
          System.out.println("ɨ��֧��");
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
  
