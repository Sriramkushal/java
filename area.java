import java.util.*;
class area
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int l,b;
     float area;
     l=sc.nextInt();
     b=sc.nextInt();
     area=l*b;
     System.out.println(area);
     System.out.format("%.2f",area);    }
}
     