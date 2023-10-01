import java.util.Scanner;
import mypack.testpack.compare;
class mypackage
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     compare c=new compare();
     int p,q,r;
     p=sc.nextInt();
     q=sc.nextInt();
     r=sc.nextInt();
     System.out.println("MAx value is"+c.greater_value(p,q,r));
     System.out.println("Minimum value is"+c.lower_value(p,q,r));
   }
}