package beginnerJava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
					Scanner input=new Scanner (System.in);
					
					int n,rem,sum=0;
					
					System.out.println("Enter your number : ");
					
					n=input.nextInt();
					
					while(n!=0) {
						
								rem=n%10;
								
								sum+=rem;
								
								n=n/10;
						
					}
					
					System.out.print("Sum of the digits is : "+sum);
		
	}
	
}
