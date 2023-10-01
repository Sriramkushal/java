class A
{
  
  public void show()
   {
     System.out.println("kgf");
   } 
}
class B extends A
{
  
  public void show()
   {
     super.show();
     System.out.println("RRR");
   } 
}
class superkey
{
  public static void main(String args[])
   {
     B b=new B();
     b.show();
   } 
}