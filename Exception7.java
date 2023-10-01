class Test
{
    int x=10;
    public void show()
    {
        System.out.println("IT");
    }
}
class Exception7
{
    public static void main(String args[])
    {
        Test t=null;
        try
        {
            t.show();
        }
        catch(NullPointerException ne)
        //catch(NullpointerException ne)
        {
            System.out.println("hlo");
        }
        finally
        {
            System.out.println("CSE");
        }
        System.out.println("Task completed");
    }
}