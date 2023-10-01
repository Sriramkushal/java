class parent
{
  int x=30;
  public void display()
   {
      System.out.println(x);
   }
}
class derived extends parent
{
  int y=40;
  public void show()
   {
      System.out.println(y);
   }
}
class derived1 extends derived
{
  int z=100;
  public void print()
   {
      System.out.println(z);
   }
}
class multilevel
{
  public static void main(String args[])
   {
      derived1 d=new derived1();
      d.show();
      d.display();
      d.print();
   }
}