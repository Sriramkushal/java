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

class single
{
  public static void main(String args[])
   {
      derived d=new derived();
      d.show();
      d.display();
   }
}