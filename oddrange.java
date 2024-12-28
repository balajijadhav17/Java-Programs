import java.util.*;
import java.util.Scanner;
class oddrange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter start number: ");
int start=sc.nextInt();
System.out.print("Enter end number: ");
int end = sc.nextInt();
for ( int i=start;i<=end;i++)
{
if (i%2 != 0)
{
System.out.print(i+ " ");
}
}
}
}