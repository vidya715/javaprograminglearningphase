import java.util.Scanner;
class point 
{
    int x,y,z;
    
    
    public void accept()
    {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("enter the x,y,z coordinate");
        x=Scanner.nextInt();
        y=Scanner.nextInt();
        z=Scanner.nextInt();
        }
    public void display()
    {
        System.out.println(x+","+y+","+z);
         }
    

public static void main (String[] arg)
{
    point p1 =new point();
    p1.accept();
    p1.display();
    
    
} }
