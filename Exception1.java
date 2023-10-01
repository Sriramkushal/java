class Exception1
{
 public static void main(String args[])
  {
   int x=10,y=0,z=0;
   System.out.println(x+" "+y);
   try
    {
      z=x/y;
      System.out.println("ram");
    }
    catch(Exception e)
    {
      z=x/2;
      System.out.println("catch block");
    }
   System.out.println(z);
  }
}