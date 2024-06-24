import java.util.Scanner;
class emp
{
    int empid;
    String name;
    float sal;
    public emp()
    {
        empid=101;
        name="vidya";
        sal=1500;
        System.out.println("empid="+empid+"name="+name+"salary="+sal);
         }
         
    public void accept()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your id");
        empid=scanner.nextInt();
        System.out.println("enter your nmae");
         name=scanner.next();
        System.out.println("enter your salary");
     sal=scanner.nextFloat();
     scanner.close();
        
    }
     public void display()
     {
         System.out.println("empid="+empid+"name="+name+"salary="+sal);
     }
     public emp (int a,String s,float b)
    {
        empid=a;
        name=new String(s);
        sal=b;
        System.out.println("empid="+empid+"name="+name+"salary="+sal);
         }
    
    public static void main(String args[])
    {
      
       emp e =new emp();
         emp e1=new emp(12,"ssss",123);
        e.accept();
        e.display();
        
        
        
    }
    
    
    
}
