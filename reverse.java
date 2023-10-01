import java.util.*;
class reverse
{
  public static void reverseofarray(int x[],int size)
  {
    int left=0,right=size-1;
    while(left<right)
    {
      int temp=x[left];
      x[left]=x[right];
      x[right]=temp;
      left++;
      right--;
     }
   }
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
       reverseofarray(x,n);
      for(i=0;i<n;i++)
      {
        System.out.print(x[i]+" ");
      }
    }
}