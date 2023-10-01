import java.util.*;
class employee
{
  String eid,ename,desg,company_name;
  double salary; 
  Scanner sc=new Scanner(System.in);
  public void getdetails()
  {
    eid=sc.nextLine();
    ename=sc.nextLine();
    desg=sc.nextLine();
    company_name=sc.nextLine();
    salary=sc.nextDouble();
  }
  public void show()
  {
   System.out.println("Eid="+eid);
   System.out.println("Ename="+ename);
   System.out.println("Designation="+desg);
   System.out.println("Company name="+company_name);
   System.out.println("Salary="+salary);
  }
  public static void main(String args[])
   {
     employee e1=new employee();
     e1.getdetails();
     e1.show();
   }
}