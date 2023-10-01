import java.util.*;
class hello
{
   public static int[] rowsum(int a[][],int row,int col)
    {
      int temp[]=new int[row];
      for(int i=0;i<row;i++)
       {
         int sum=0;
         for(int j=0;j<col;j++)
          {
            sum=sum+a[i][j];
          }
          temp[i]=sum;
        }
       return temp;
    }  
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int a[][],i,j,row,col;
     row=sc.nextInt();
     col=sc.nextInt();
     a=new int[row][col];
     for(i=0;i<row;i++)
        for(j=0;j<col;j++)
           a[i][j]=sc.nextInt();
     int result[]=rowsum(a,row,col);
     for(int k=0;k<row;k++)
          System.out.print(result[k]+" ");
   }
}