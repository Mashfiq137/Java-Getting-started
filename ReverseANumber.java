package beginnerJava;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
					Scanner input=new Scanner(System.in);
					
					int n,rem,rev=0;
					
					System.out.println("Enter any number : ");
					
					n=input.nextInt();
					
					while(n!=0) {
						
								rem=n%10;
								
								rev=rev*10+rem;
								
								n=n/10;
								
								
					}
					
					System.out.println("Reverse of the number is : "+rev);
		
		
	}
	
}
