import java.util.Scanner;

class student
{
    int  roll;
    String name;
    
    
    public student()
    {
        roll=71;
        name = "vidya";
        System.out.println("Roll no is: " + roll + " and name is: " + name);
    }
    public void  accept()
    {
          Scanner scanner=new Scanner(System.in);
        System.out.println("enter the roll no");
         roll=scanner.nextInt();
         
        System.out.println("enter the string");
         name=scanner.next();
         scanner.close();
    }
     public void display()
     {
         System.out.println("rollno is="+roll+"and name ="+name);
     }
    
    public static void main(String args[])
    {
      student s1=new student();
     
      s1.accept();
      s1.display();
        
    }
    
}

    
    
