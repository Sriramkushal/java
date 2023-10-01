import java.sql.*;
class DBcon
{
public static void main(String args[])
{
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kushal","root","Kushal@16");
if(con!=null)
System.out.println("Database Connected");
else
System.out.println("Not Connected");
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}