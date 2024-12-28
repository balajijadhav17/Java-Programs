import java.util.*;
import java.util.Scanner;
class tablef
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.print("Enter number for printing table: ");
int n=sc.nextInt();
System.out.println();
for (int i=1;i<=10;i++)
{
int t=i*n;
System.out.println(+t);
}
}
}