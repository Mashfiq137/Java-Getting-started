package beginnerJava;

import java.util.Scanner;

public class EvenOdd {

			public static void main(String[] args ) {
				
							Scanner input=new Scanner (System.in);
							
							int n;
							
							System.out.println("Enter any positive integer  : ");
							
							n=input.nextInt();
							
							if (n>=0) {
								
										if(n%2==0) {
											
													System.out.println("The number is Even.");
											
										}
										
										else {
											
											
													System.out.println("The number is Odd.");
											
										}
								
								
										}
							
							else {
								
													System.out.println("Enter a positive integer.Try running the code again.");
								
							}
				
				
			}
	
}
