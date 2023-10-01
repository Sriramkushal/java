import java.sql.*;
import java.util.Scanner;
class preparedStatementDemo
{
  public static void main(String args[])
   {
     int k;
     Scanner sc=new Scanner(System.in);
     Connection con=null;
     PreparedStatement pstmt=null;
     try
     {
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kushal","root","Kushal@16");
       if(con!=null)
       {
         System.out.println("Connection Established");
       }
       pstmt=con.prepareStatement("insert into course values(?,?,?,?,?,?)");
        k=sc.nextInt();
        sc.nextLine();
       while(k>0)
       {
         String cid=sc.nextLine();
         String cname=sc.nextLine();
         float fee=sc.nextFloat();
         int duration =sc.nextInt();
         sc.nextLine();
         String trainername=sc.nextLine();
         int mobile=sc.nextInt();
         sc.nextLine();
         pstmt.setString(1,cid);
         pstmt.setString(2,cname);
         pstmt.setFloat(3,fee);
         pstmt.setInt(4,duration);
         pstmt.setString(5,trainername);
         pstmt.setInt(6,mobile);
         pstmt.executeUpdate();
         k--;
       }
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
}