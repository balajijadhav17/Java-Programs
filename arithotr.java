import java.util.*;
import java.util.Scanner;
class arithotr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number:");
int n1=sc.nextInt();
int n2=sc.nextInt();
int r1= n1+n2;
int r2= n1-n2;
int r3= n1*n2;
int r4= n1/n2;
System.out.println("Addition of " +n1+ " and " +n2+ " is: " +r1);
System.out.println("Substraction of " +n1+ " and " +n2+ " is: " +r2);
System.out.println("Multiplication of " +n1+ " and " +n2+ " is: " +r3);
System.out.println("Division of " +n1+ " and " +n2+ " is: " +r4);
}
}