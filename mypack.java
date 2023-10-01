import java.util.Scanner;
import acet.ac.in.stringpractice;
class User2
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 stringpractice s=new stringpractice();
	 String input=sc.nextLine();
	 System.out.println("Reverse of the given input ="+s.findReverse(input));
	 System.out.println("Given String is Palindrome or not: "+s.isPalindrome(input));
	 System.out.println("Vowels in the given input = "+s.findVowels(input));
	 
	 sc.close();
   }

}
