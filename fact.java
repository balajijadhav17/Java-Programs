import java.util.*;
import java.util.Scanner;
class fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number for finding factorial: ");
int n=sc.nextInt();
int f=1,i;
for (i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("Factorial of " +n+ " is: " +f);
}
}

