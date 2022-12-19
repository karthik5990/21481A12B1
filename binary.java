import java.util.*;
class Binary
{
static public void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter an integer between 1 and 255");
int n=s.nextInt();
if(n>=1&&n<=255)
{
String r=Integer.toBinaryString(n);
int p=Integer.parseInt(r);
System.out.println(String.format("08d",p));
}
else
System.out.println("out of range");
}
}