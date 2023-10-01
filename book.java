import java.util.*;
class book
{
  String bid,bname,author;
  int pages;
  double cost;
  Scanner sc=new Scanner(System.in);
  public void getdetails()
  {
    bid=sc.nextLine();
    bname=sc.nextLine();
    author=sc.nextLine();
    pages=sc.nextInt();
    cost=sc.nextDouble();
  }
  public void show()
  {
    System.out.println("Bid="+bid);
    System.out.println("Bname="+bname);
    System.out.println("Author="+author);
    System.out.println("pages="+pages);
    System.out.println("cost="+cost);
  }
  public static void main(String args[])
  {
    book b1=new book();
    System.out.println("b1.details:");
    b1.getdetails();
    b1.show();
    book b2=new book();
    System.out.println("b2.details:");
    b2.getdetails();
    b2.show();
    book b3=new book();
    System.out.println("b3.details:");
    b3.getdetails();
    b3.show();
   }
}
  