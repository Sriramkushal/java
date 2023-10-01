package acet.ac.in;
public class stringpractice
{
   public String findReverse(String str)
   {
       String s="";                       
	   for(int i=0;i<str.length();i++)
	   {
	       s=str.charAt(i)+s;  
	   }
	   return s;
   }
   public boolean isPalindrome(String str)
   {
      String rev=findReverse(str);
	  if(str.equals(rev))
	    return true;
      else 
	     return false;
   }
   public String findVowels(String str)
   {
       String vowels="AEIOUaeiou";
	   String ret_String="";
	   for(int i=0;i<str.length();i++)
	   {
	       char ch=str.charAt(i);
		   if(vowels.contains(ch+""))
		      ret_String=ret_String+ch;
	   }
	   return ret_String;
   }
}