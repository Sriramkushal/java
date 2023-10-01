class Bc
{
int a;
};
class Dc extends Bc
{
int a;
void set (int x, int y)
{
super.a=x;
a=y; //by default 'a' is preceded with 'this.' since 'this.' represents current class
}
void sum ()
{
System.out.println ("SUM = "+(super.a+a));
}
};
class InDemo1
{
public static void main (String k [])
{
Dc do1=new Dc ();
do1.set (20, 30);
do1.sum ();
}
};
