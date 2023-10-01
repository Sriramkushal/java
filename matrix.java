import java.util.*;
class matrix
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int row,col,i,j,matrix[][];
      row=sc.nextInt();
      col=sc.nextInt();
      matrix=new int[row][col];
      for(i=0;i<row;i++)
        for(j=0;j<col;j++)
           matrix[i][j]=sc.nextInt();
      System.out.println("Matrix is:");
      for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
          {
             System.out.print(matrix[i][j]+" ");
          }
            System.out.println();
      }
   }
}