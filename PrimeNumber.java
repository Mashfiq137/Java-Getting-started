package beginnerJava;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
			Scanner input=new Scanner(System.in);
			
			int n;
			
			System.out.println("Enter your number : ");
			
			int count=0;
			
			n=input.nextInt();
			
			for(int i=2;i<n;i++) {
				
							
									if(n%i==0) {
										
													count++;
											
													break;
										
									}
				
			}
			
			if(count==0) {
				
				System.out.println("Prime.");
			}
			
			else {
				
				
				System.out.println("Not Prime");
			}
			
		
	}

}
