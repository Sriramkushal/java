import java.util.*;
class totoal
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int sum=0,avg=0;
     for(int i=0;i<args.length;i++)
     {
        sum+=Integer.parseInt(args[i]);
     }
        avg=sum/args.length;
        System.out.println(sum);
        System.out.println(avg);
   }
}