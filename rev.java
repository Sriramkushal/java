import java.util.*;
class rev
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int max,n,i,x[],temp=0;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
      x[i]=sc.nextInt();
    }
    for(i=n-1;i>=0;i--)
    {
      System.out.print(x[i]+" ");
    }
  }
}
       