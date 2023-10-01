import java.util.*;
class hi
{
  int age=18; 
  String name;
  public hi()
  {
     System.out.println("Default Constructor");
     name="ram";
  }
  public hi(String cname)
  {
    System.out.println("Parameterized constructor with one value");
    name=cname;
  }
  public hi(String cname,int cage)
  {
    System.out.println("Parameterized constructor with two value");
    name=cname;
    age=cage;
  }
  public void show()
  {
    System.out.println("Hello "+name+" your age is"+age);
  }
  public static void main(String args[])
  {
    hi c1=new hi();
    hi c2=new hi("surya");
    hi c3=new hi("bharath",21);
    c1.show();
    c2.show();
    c3.show();
  }
}