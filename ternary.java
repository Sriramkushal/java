import java.util.*;
class ternary
{
  public static void main(String args[])         
   {
      Scanner sc=new Scanner(System.in);
      int age;
      String result;
      age=sc.nextInt();
      result=age>18?"eligible":"not eligible";
      System.out.println(result);
   }
} 