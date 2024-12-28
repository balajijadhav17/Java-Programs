import java.util.*;
class primerange
{
public static void main(String args[])
{
int i,c,j;
for(i=2;i<=20;i++)
{
 c=0;

 for(j=2;j<i;j++)
 {
 if (i%j==0)
 {
 c=1;
 break;
 }
 }
 
 if (c==0)
 {
 System.out.print(i + " ");
 }

 }
 }
}