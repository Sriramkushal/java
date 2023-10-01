import java.io.*;
class info
{
   public static void main(String args[])throws Exception
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String name,branch;
      int roll;
      name=br.readLine(); 
      branch=br.readLine();
      roll=Integer.parseInt(br.readLine());
      System.out.println(name);
      System.out.println(branch);
      System.out.println(roll);
     }
}