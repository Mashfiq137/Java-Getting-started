package beginnerJava;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String [] args) {
		
					Scanner input=new Scanner(System.in);
					
					int x,y;
					
					System.out.print("Enter the value of x  : ");
					
					x=input.nextInt();
					
					System.out.print("Enter the value of y  : ");
					
					y=input.nextInt();
					
					int p=(x>y)?x:y;
					
					System.out.println("The larger of the two is : "+p);
		
		
	}
	
	
}
