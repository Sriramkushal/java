import java.util.*;
class numinword
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int num;
	 num=sc.nextInt();         
	 switch(num)
         {
                  case 0:
                             System.out.println("Zero");
                             break;
			case 1:    
                             System.out.println("One");
                             break;
			case 2:
					System.out.println("two");
					break;
			case 3:     
					System.out.println("three");
					break;

			case 4:
					System.out.println("four");
					break;
			case 5:
					System.out.println("five");
					break;
			case 6:
					System.out.println("six");
					break;
			case 7:
					System.out.println("seven");
					break;

			case 8:
					System.out.println("eigth");
					break;
			case 9:
					System.out.println("nine");
					break;
			default:
					System.out.println("Invalid Number");
					break;
         }
	 sc.close();
  }
}
