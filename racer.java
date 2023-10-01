import java.util.*;
class racer
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int a,b,c,d,e;
     float avg;
     System.out.println("Enter speeds");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     d=sc.nextInt();
     e=sc.nextInt();
     avg=(a+b+c+d+e)/5;
     if(avg<a)
     {
         System.out.println("A has speed "+a);
     }
     if(avg<b)
     {
         System.out.println("B has speed "+b);
     }
     if(avg<c)
     {
         System.out.println("C has speed "+c);
     }
     if(avg<d)
     {
         System.out.println("D has speed "+d);
     }
     if(avg<e)
     {
         System.out.println("E has speed "+e);
     }
  } 
}