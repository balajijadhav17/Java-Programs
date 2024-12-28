import java.util.*;
import java.util.Scanner;
class threeif
{
public static void main(String args[])
{
int n1,n2,n3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number:");

n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
if (n1>n2 && n1>n3)
{
System.out.println(n1+ " is greater");
}
else if (n2>n1 && n2>n3)
{
System.out.println(n2+ " is greater");
}
else if (n1==n2 && n2==n3)
{
System.out.println(n1+ " " +n2+ " " +n3+ " all are equals");
}
else
{
System.out.println(n3+ " is greater");
}
}
}