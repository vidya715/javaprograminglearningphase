import java.util.Scanner;
class reve{
    
public static void main(String args[])
{
int a,b;
int rev=0;
{
System.out.println("enter the number");
Scanner Scanner=new Scanner(System.in);

 a = Scanner.nextInt();
while(a>0)
{
    b=a%10;
    rev=rev*10+b;
    a=a/10;
  
}
  System.out.println("reverse number is"+rev);    
}
}}
