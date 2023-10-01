import java.util.Scanner;
abstract class shape
{
  int s1,s2;
  float area;
  final float p1=3.14f;
  Scanner sc=new Scanner(System.in);
  public abstract void get_input();
  public abstract void cal_Area();
  public void showarea()
  {
    System.out.println("Area="+area);
  }
}
class Rectangle extends shape
{
  public void get_input()
  {
    System.out.println("Enter the length and breadth");
    s1=sc.nextInt();
    s2=sc.nextInt();
  }
  public void cal_Area()
  {
   area=s1*s2;
  }
}
class circle extends shape
{
  public void get_input()
  {
    System.out.println("Enter the Radius");
    s1=sc.nextInt();
  }
  public void cal_Area()
  {
   area=s1*p1*s1;
  }
}
class square extends shape
{
  public void get_input()
  {
    System.out.println("Enter the length ");
    s1=sc.nextInt();
  }
  public void cal_Area()
  {
   area=s1*s1;
  }
}
class ma
{
  public static void main(String args[])
   {
     shape s;
     s=new Rectangle();
     s.get_input();
     s.cal_Area();
     s.showarea();

     s=new circle();
     s.get_input();
     s.cal_Area();
     s.showarea();

     s=new square();
     s.get_input();
     s.cal_Area();
     s.showarea();
   }
}
