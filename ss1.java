import java.util.*;
class ss1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int age;
    age=sc.nextInt();
    String result=age>=18?"Eligible for vote":"Not Eligible for vote";
    System.out.println(result);
}
}
    