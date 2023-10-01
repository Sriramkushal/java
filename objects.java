class parent
{
  public void m1()
   {
    System.out.println("m1");
   }
   public void m2()
   {
    System.out.println("M2");
   }
   public void m3()
   {}
}
class child extends parent
{
  public void m2()
   {
    System.out.println("M2 child class");
   }
   public void m3()
   {
    System.out.println("M3 child class");
   }
}
class mainclass
{
  public static void main(String args[])
   {
     parent p=new child();
     p.m1();
     p.m2();
     p.m3();
   }
} 
