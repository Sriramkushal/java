import java.util.*;
class Mover
{
  public void swap(int a,int b)
   {
     System.out.println("Before swapping"+a+","+b);
     int temp=a;
     a=b;
     b=temp;
     System.out.println("After swapping"+a+","+b);
   }
   public void swap(char a,char b)
   {
     System.out.println("Before swapping"+a+","+b);
     char temp=a;
     a=b;
     b=temp;
     System.out.println("After swapping"+a+","+b);
   }
   public void swap(Double a,Double b)
   {
     System.out.println("Before swapping"+a+","+b);
     Double temp=a;
     a=b;
     b=temp;
     System.out.println("After swapping"+a+","+b);
   }
   public static void main(String args[])
   {
     Mover m1=new Mover();
     m1.swap(3,4);
     m1.swap(3.33,1.33);
     m1.swap('a','c');
   }
}