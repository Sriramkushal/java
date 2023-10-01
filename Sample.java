class Sample
{
	int x=100;
      public Sample(){}
	public Sample(int p)  // Parameterized Constructor
	{
		System.out.println("Constructor Execution");
		x=p;
	}
	public void show()
	{
		System.out.println(x);
	}
	public static void main(String args[])
	{
         Sample s1=new Sample();
		 Sample s2=new Sample(201);
	  // s1.x= 101  s2.x= 201  s3.x=301
		 s1.show();   //
		 s2.show();
		// s3.show();
	}
}