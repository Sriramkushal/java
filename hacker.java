import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0,a,b,n;
        for(int i=0;i<t;i++)
        {
             a = sc.nextInt();
             b = sc.nextInt();
             n = sc.nextInt();
        }
       
        for(int i=0;i<n;i++)
        {
            sum=sum+(a+i*b);
            System.out.println(sum);
        }
    }
}
