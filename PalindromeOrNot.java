package beginnerJava;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
					Scanner input=new Scanner(System.in);
					
					int n,rem,t,rev=0;
					
					System.out.println("Enter the number : ");
					
					n=input.nextInt();
					
					t=n;
					
					while(t!=0) {
						
								rem=t%10;
								
								rev=rev*10+rem;
								
								t=t/10;
						
					}
					
					if(rev==n) {
						
							System.out.println("Palindrome.");
							
							
					}
					
					else{
						
						System.out.println("Not Palindrome.");
						
					    }
		
	}
	
}
