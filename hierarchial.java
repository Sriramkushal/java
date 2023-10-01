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
class derived1 extends parent
{
  int z=100;
  public void print()
   {
      System.out.println(z);
   }
}
class hierarchial
{
  public static void main(String args[])
   {
      derived d=new derived();
      d.show();
      d.display();
      derived1 d1=new derived1();
      d1.display();
      d1.print();
   }
}