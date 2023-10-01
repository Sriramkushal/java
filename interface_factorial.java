interface factorial
{
    int fact(int n);
}
class dev1 implements factorial
{
    public int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}
class dev implements factorial
{
    public int fact(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else
        return n*fact(n-1);
    }
}
class main
{
    public static void main(String args[])
    {
        dev d1=new dev();
        System.out.println("through iteration"+d1.fact(5));
    }
}