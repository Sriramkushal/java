import java.util.*;
class Exception8
{
    public static int division(int x,int y)throws ArithmeticException
    {
        int z=0;
        z=x/y;
        return z;
    }
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int m,n,result=0;
        m=s.nextInt();
        n=s.nextInt();
        try
        {
            result=division(m,n);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Dashara");
        }
        System.out.println(result);
        System.out.println("Task completed");
    }
}