import java.util.Scanner;
class Exception6
{
    public static void main(String args[])
    {
        int x,y,z=0;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        try
        {
            z=x/y;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Y value must be non zero");
            z=x/2;
        }
        finally
        {
            System.out.println("Finally block is executed\n");
        }
        System.out.println(z);
        System.out.println("Task complete");
    }
}