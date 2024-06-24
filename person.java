class  studen extends person
{
  int roll;
  float per;
  protected void setdata()
      {
          super.setdata();
          roll=10;
          per=98;
      }

protected void display()
{
super.display();
System.out.println("roll="+roll+"and percentage is+"+per);
}
 }
 public class demo {
    public static void main(String args[]) {
        
        studen s1 = new studen();
        s1.setdata(); // Calling overridden method from student class
        s1.display(); // Calling overridden method from student class
    }
}
