import java.util.*;
class Array8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int o,i,j,matrix1[][],matrix2[][];
		o=sc.nextInt();
		matrix1=new int[o][o];
		matrix2=new int[o][o];
		for(i=0;i<o;i++)
			for(j=0;j<o;j++)
			   matrix1[i][j]=sc.nextInt();
		for(i=0;i<o;i++)
			for(j=0;j<o;j++)
			   matrix2[i][j]=sc.nextInt();
		for(i=0;i<o;i++)
		{
			 for(j=0;j<o;j++)
				  System.out.print(matrix1[i][j]+matrix2[i][j]+"  ");
			 System.out.println();

		}
	}
}java