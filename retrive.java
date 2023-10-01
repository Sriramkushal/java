import java.sql.*;
class jdbc3
{
    public static void main(String args[])
      {
        Connection con=null;
        Statement st=null;
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kushal","root","Kushal@16");
          if(con!=null)
			System.out.println("Connection is Established");
          st=con.createStatement();
          String query="select * from course";
          ResultSet rs=st.executeQuery(query);
          while(rs.next());
          {
            String cid=rs.getString(1);
            String cname=rs.getString(2);
            float fee=rs.getFloat(3);
            String trainername=rs.getString(4);
            System.out.println(cid+"  "+cname+"  "+fee+"  "+trainername);
           }
         } 
        catch(Exception e)
        {
           System.out.println(e);
        }
        finally
        {
           con.close();
        }
       System.out.println("Task Completed"); 
}
}
