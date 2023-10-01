class Exception5
{
 public static void main(String args[])
 {
   int x=10,y,z=0;
   try
   {
     x=Integer.parseInt(args[0]);
     y=Integer.parseInt(args[1]);
     z=x/y;
   }
   catch(ArithmeticException ae)
   {
    System.out.println("y is invalid and non zero");
    z=x/2;
   }
   catch(NumberFormatException nfe)
   {
    System.out.println("input be number");
   }
   catch(ArrayIndexOutOfBoundsException aoe)
   {
    System.out.println("Array size is low");
   }
   catch(Exception e)
   {
    System.out.println("Hello");
   }