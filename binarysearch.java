import java.util.Scanner;
class BinarySearch {
     public static void main(String args[]) {
	int c, first, last, middle, n, search, array[];
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the numberof elements:");
	n = sc.nextInt();
	array = new int[n];
	System.out.println("enter "+n+" integers:");
	for(c=0;c<n;c++)
	array[c]=sc.nextInt();
	System.out.println("enter a value to search");
	search = sc.nextInt();
	first =0;
	last=n-1;
	middle = (first+last)/2;
	while(first<=last) {
	   if(array[middle]<search)
		first = middle+1;
	   else if(array[middle]==search) {
		System.out.println(search +" found at location "+(middle+1));
		break;  }
	   else
		last= middle-1;
		middle=(first+last)/2;
	  }
	if(first>last)
		System.out.println("element not found");
	}
  }
