class Exception2
{
 public static void main(String args[])
  {
   int x[]={1,2,3,4,5};
   try
   {
   for(int i=0;i<=x.length;i++)
    System.out.println(x[i]);
   }
    catch(Exception e)
    {
     System.out.println("Length of array is out!");
    }
  System.out.println("Task completed");
  }
}