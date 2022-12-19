import java.util.*;
import java.lang.*;
class A{
public static void main(String args[]){
int i,c,a;
Scanner s=new Scanner(System.in);
System.out.println("enter number of table");
a=s.nextInt();
for(i=1;i<=10;i++)
{
c=i*a;
System.out.println(a+"*"+i+"="+c);
}}}