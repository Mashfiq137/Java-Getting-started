package beginnerJava;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		
					
		Scanner input=new Scanner (System.in);
		
		int n,t,sum=0,rem;
		
		System.out.println("Enter a number : ");
		
		n=input.nextInt();
		
		t=n;
		
		while(t!=0) {
			
					rem=t%10;
					
					sum+=rem*rem*rem;
					
					t/=10;
			
		}
		
		if(sum==n) {
			
						System.out.println("The given number is an Armstrong number.");
			
		}
		
		else {
			
					
						System.out.println("Not  an Armstrong number .");
			
		}
		
		
	}
	
}
