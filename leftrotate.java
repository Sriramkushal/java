import java.util.*;
class leftrotate
{
   public static void leftrotate(int x[],int d,int n)
   {
     reverse(x,0,d-1);
     reverse(x,d,n-1);
     reverse(x,0,n-1);  
   }
   public static void reverse(int x[],int low,int high)
   {
     while(low<high)
       {
         int temp=x[low];
         x[low]=x[high];
         x[high]=temp;
        low++;
       high--;
       }
   }
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int n,d,new_size,x[];
     System.out.println("Enter n value");
     n=sc.nextInt();
     System.out.println("Enter d value");
     d=sc.nextInt();
     x=new int[n];
     for(int i=0;i<n;i++)
     { 
       x[i]=sc.nextInt();
     }
     leftrotate(x,d,n);
     for(int i=0;i<n;i++)
     {
       System.out.print(x[i]+" ");
     }
   }
}