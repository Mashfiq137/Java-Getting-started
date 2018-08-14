package beginnerJava;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		
						Scanner input=new Scanner(System.in);
						
						int n;
						
						int prod=1;
						
						System.out.println("Enter a positive integer :");
						
						n=input.nextInt();
						
						if(n==0) {
							
									System.out.println("Factorial of 0 is : 0");
							
						}
						
						else {
						
						for(int i=n;i>=1;i--) {
							
										prod=prod*i;
							
						}
						
						System.out.println("Factorial of "+n+"is : "+prod);
						
						}
		
	}

}
