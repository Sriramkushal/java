class parent
{
  public void show()
   {
      System.out.println("hiii");
   }
}
class child extends parent
{
   public void show()
    {
      System.out.println("Hello");
    }
}
class overriding
{
   public static void main(String args[])
    {
       parent a=new parent();
       a.show();
       child d=new child();
       d.show();
}
}