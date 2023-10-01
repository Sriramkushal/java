interface vehicle
{
    void changeGear(int g);
    void increasespeed(int s);
    void Brake(int b);
}
class bike implements vehicle
{
    int gear,speed=20;
    public void changeGear(int g)
    {
        gear=g;
    }
    public void increasespeed(int s)
    {
        speed=speed+s;
    }
    public void Brake(int b)
    {
        speed=speed-b;
    }
    public void show()
    {
        System.out.println("Bike speed is "+speed+" on gear "+
        gear);
    }
}
class main
{
    public static void main(String args[])
    {
        bike b1=new bike();
        b1.changeGear(3);
        b1.increasespeed(50);
        b1.show();
        b1.Brake(45);
        b1.show();
        bike b2=new bike();
        b2.changeGear(2);
        b2.increasespeed(20);
        
    }
}