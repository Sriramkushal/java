import java.util.*;
class ss
{
   public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a == b == c )
         {
            System.out.println("Equilateral");
         }
        else if(a==b||b==c||a==c)
         {
             System.out.println("Isosceles");
         }
        else
         {
             System.out.println("Scalence");
         }
       }
}