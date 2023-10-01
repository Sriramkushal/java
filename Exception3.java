class Exception3
{
 public static void main(String args[])
 {
  String name="ram";
  try
  {
   System.out.println(name.charAt(3));
  }  
  catch(Exception e)
  {
   System.out.println("Different datatype");
  }
System.out.println("Task completed");
 }
} 