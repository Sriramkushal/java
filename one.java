class Commandline2
{
   public static void main(String args[])
   
   {
  int sum=0;
      for(int i=args.length-1;i>=0;i--)
	  {
           System.out.println(args[i]);
		 sum+=Integer.parseInt(args[i]);
		}
		 System.out.print(sum);
   }
   
}
