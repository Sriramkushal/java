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
class service implements i1
{
    public void m1()
    {
        System.out.println("m1");
    }
    public void m2()
    {
        System.out.println("m2");
    }
    public void m3()
    {
        System.out.println("my own value");
    }
}
class service1 implements i1
{
    public void m1()
    {
        System.out.println("m1");
    }
    public void m2()
    {
        System.out.println("m2");
    }
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
        i1 ob=new service1();
        ob.m1();
        ob.m2();
        ob.m3();
    }
}