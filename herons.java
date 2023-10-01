import java.util.*;
class herons
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int a,b,c;
     float area,s;
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     s=(float)(a+b+c)/2;
	area=(float)Math.sqrt(s*(s-1)*(s-b)*(s-c));
     System.out.println(area);
   }
}