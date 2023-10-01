abstract class vehicle
{
  public abstract int get_no_weels();
  public abstract int seating_capacity();
}
class bike extends vehicle
{
  public int get_no_weels()
   {
     return 2;
   }
  public int seating_capacity()
   {
    return 2;
   }
}
 class auto extends vehicle
{
  public int get_no_weels()
   {
     return 3;
   }
  public int seating_capacity()
   {
    return 3;
   }
}
class car extends vehicle
{
  public int get_no_weels()
   {
     return 4;
   }
  public int seating_capacity()
   {
    return 5;
   }
}
class mainclass
{
  public static void main(String args[])
   {
     vehicle v;
     int w,c;
     v=new bike();
     System.out.println("**************************");
     System.out.println("Bike");
     w=v.get_no_weels();
     c=v.seating_capacity();
     System.out.println("No of weels="+w);
     System.out.println("seating arrangement="+c);
     System.out.println("*************************");
     v=new auto();
     System.out.println("**************************");
     System.out.println("Auto");
     w=v.get_no_weels();
     c=v.seating_capacity();
     System.out.println("No of weels="+w);
     System.out.println("seating arrangement="+c);
     System.out.println("*************************");
     v=new car();
     System.out.println("**************************");
     System.out.println("Car");
     w=v.get_no_weels();
     c=v.seating_capacity();
     System.out.println("No of weels="+w);
     System.out.println("seating arrangement="+c);
     System.out.println("*************************");
   }
}
    
  