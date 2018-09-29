
import java.util.Scanner;

public class ProblemQ {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three-digit integer: ");
		
		int x = input.nextInt();
		
		int n=x;
		
		int rem=0,rev=0;
		
		while(x!=0) {
			 
					rem = x % 10;
							
					rev = rev*10 + rem;
					
					x = x/10;
					
		}
		
		if(n==rev) {
					
			System.out.println(n+" is a palindrome");
			
		}
		
		else {
			
			
			System.out.println(n+" is not a palindrome");
		}
		
	}
	
}
