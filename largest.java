import java.util.*;
class largest
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
    for(i=1;i<n;i++)
    {
      if(x[i-1]>x[i])
        {
          temp=1;
        }
    }
    if(temp==1)
    {
      System.out.println("Elements are unsorted");
    }
    else
    {
      System.out.println("Elements are sorted");
    }

  }
}
       