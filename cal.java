import java.util.*;
class cal
{
  public static int add(int p,int q)
    {
       return p+q ;
    }
  public static int sub(int p,int q)
    {
       return p-q;
    }
  public static int mul(int p,int q)
    {
       return p*q;
    }
  public static int div(int p,int q)
    {
       return p/q;
    }
  public static int mod(int p,int q)
    {
       return p%q;
    } 
  public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
       int ch,a,b,res;
       while(true)
       {
          System.out.println("Enter your choice"); 
          System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division\n5.modulous\n6.exit");
          ch=sc.nextInt();
          switch(ch)
          {
            case 1:
                 a=sc.nextInt();
                 b=sc.nextInt();
                 res=add(a,b);
                 System.out.println("The value is "+res);

                 break;
            case 2:
                 a=sc.nextInt();
                 b=sc.nextInt();
                 res=sub(a,b);
                 System.out.println("The value is "+res);
                 break;
            case 3:
                 a=sc.nextInt();
                 b=sc.nextInt();
                 res=mul(a,b);
                 System.out.println("The value is "+res);
                 break;
            case 4:
                 a=sc.nextInt();
                 b=sc.nextInt();
                 res=div(a,b);
                 System.out.println("The value is "+res);
                 break;
            case 5:
                 a=sc.nextInt();
                 b=sc.nextInt();
                 res=mod(a,b);
                 System.out.println("The value is "+res);
                 break;
            case 6:
                 System.exit(0);
            Default :
                 System.out.println("Enter valid input");
           }
       }
}}
