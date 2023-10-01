import java.util.*;
class vowel
{
  public static void main(String args[])
{
  Scanner sc=new Scanner (System.in);
  char ch;
  ch=sc.nextLine().charAt(0);
  char nch=ch;
  ch=Character.toLowerCase(ch);
  if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
   System.out.println(nch+" is vowel");
  else
   System.out.println(nch+" is not a vowel");
}}