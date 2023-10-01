interface i1
{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("Default value");
    }
    static void m4()
    {
        System.out.println("Static value");
    }
}
interface i2
{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("i2 default value");
    }
   
}
class service implements i1,i2
{
    public void m1()
    {
        System.out.println("m1");
    }
    public void m2()
    {
        System.out.println("m2");
    }
    /*public void m3()
    {
        System.out.println("my own value");
    }*/
}
class mainclass
{
    public static void main(String args[])
    {
        i1 obj=new service();
        obj.m1();
        obj.m2();
        obj.m3();
        i1.m4();
    }
}