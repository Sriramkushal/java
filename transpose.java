import java.util.*;
class transpose
{
   public static void  transposemat(int a[][],int row,int col)
    {
      int temp[][]=new int[row][col];
      for(int i=0;i<row;i++)
         for(int j=0;j<col;j++)
           temp[i][j]=a[j][i];
        display(temp,row,col); 
    }  
    public static void display(int temp[][],int row,int col)
   {
     System.out.println("Matrix is:");
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
          {
             System.out.print(temp[i][j]+" ");
          }
            System.out.println();
      }
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
     display(a,row,col);
     transposemat(a,row,col);
   }
}