package beginnerJava;

import java.util.Scanner;

public class ArithmaticDemp {
	
	public static void main(String[] args) {
		
					int num1;
					
					int num2;
					
					Scanner im=new Scanner(System.in);
					
					System.out.println("Enter the first number:");
					
					num1=im.nextInt();
					
					System.out.println("Enter the second number: ");
					
					num2=im.nextInt();
					
					int result=num1+num2;
		
					System.out.println("Sum = "+result);
					
					result=num1-num2;
					
					System.out.println("Diff = "+result);
					
					result = num1*num2;
					
					System.out.println("Mul = "+result);
					
					double rresult=(double) num1/num2;
					
					System.out.println("Div = "+rresult);
					
	}			

}
