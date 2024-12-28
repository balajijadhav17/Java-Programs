import java.util.*;
class firstmethod
{
  int a,b,result;
 void getdata(int a,int b)
 {
  result=a+b;
  System.out.println("Addtion of " +a+ " and " +b+ " is:" +result);
  }
  public static void main(String args[])
  { 
  firstmethod s=new firstmethod();
  s.getdata(10,20);
  }
  }
  