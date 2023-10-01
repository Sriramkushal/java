import java.util.*;
class array1
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n,x[],i;
   n=sc.nextInt();
   x=new int[n];
   for(i=0;i<n;i++)
   {
     x[i]=sc.nextInt();
   }
   for(i=0;i<n;i++)
   {
     System.out.print(x[i]+" ");
   }
  }
}