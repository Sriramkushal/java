import java.util.*;
class triangle
{
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a1,b1,c1,a2,b2,c2,sum1=0,sum2=0;
      String name1,name2;
      System.out.println("1st hero");
      name1=sc.nextLine();
      a1=sc.nextInt();
      b1=sc.nextInt();
      c1=sc.nextInt();
      System.out.println("2nd hero");
      name2=sc.nextLine();
      sc.nextLine();
      a2=sc.nextInt();
      b2=sc.nextInt();
      c2=sc.nextInt();
      sum1=(a1*10)+(b1*5)+(c1*(-5));
      sum2=(a2*10)+(b2*5)+(c2*(-5));
      if(sum1>sum2)
      {
        System.out.println(name1);
      }
      else
       {
         System.out.println(name2);
        }
    }
}