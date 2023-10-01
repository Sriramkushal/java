import java.util.Scanner;
class sixth
{
public void wish(String name)
{
  System.out.println("Good morning "+name);
}
public static void main(String args[])
{
   sixth s=new sixth();
   String name;
   Scanner sc=new Scanner(System.in); 
   name=sc.nextLine();
   s.wish(name);
}
}
