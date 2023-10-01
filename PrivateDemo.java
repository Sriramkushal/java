class PrivateDemo1
{
  private int age=20;
  private String name="kushal";
  double salary=15000;
  public void setAge(int age)
  {
     this.age=age;
  }
   public int getage()
  {
    return age;
  }
   public String getname()
  {
    return name;
  }
}
class PrivateDemo
{
  public static void main(String args[])
  {
   PrivateDemo1 d1=new PrivateDemo1();
   System.out.println(d1.getage());
   System.out.println(d1.getname());
   System.out.println(d1.salary);
  }
}