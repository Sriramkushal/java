class Employee
{
	int empid;
	String empname;
	double sal;
	static String org_name="Aditya Engineering College";
	static int count=0;
	static double total_sal=0;

	public Employee(int empid,String empname,double sal)
	{
		this.empid=empid;
		this.empname=empname;
		this.sal=sal;
		Employee.count++;
		Employee.total_sal+=sal;
	}
	public void showEmployeeInfo()
	{
		System.out.println("Emp Id: "+empid);
		System.out.println("Emp Name: "+empname);
		System.out.println("Salary: "+sal);
		System.out.println("Organization: "+Employee.org_name);
	}
	public static void showTotalInfo()
	{
		System.out.println("Total Objects created: "+Employee.count);
		System.out.println("Total Salaries Paid: "+Employee.total_sal);
	}
	public static void main(String args[])
	{
		showTotalInfo();
		Employee e1=new Employee(101,"Ramesh",52000);
		showTotalInfo();
		Employee e2=new Employee(102,"Sivaram",34000);
		showTotalInfo();
		e1.showEmployeeInfo();
		e2.showEmployeeInfo();
	}
}
