import java.sql.*;
class InsertionDemo
{
	public static void main(String args[])
	{
		try
		{
		// 1. Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get the Connection Object
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kushal","root","Kushal@16");

		//if(con!=null)
		//	System.out.println("Connection is Established");
		//else
		//	System.out.println("Connection failed");

        String query="insert into course values('C002','Python',5000,3,'Pavan B',197458)";
		//3. Creation of Statement Object
		Statement st=con.createStatement();
		st.executeUpdate(query);
        System.out.println("Query executed Successfully");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}