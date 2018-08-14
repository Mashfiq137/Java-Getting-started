package beginnerJava;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		
							  /*
							   * if(condition){
							   * 	
							   * 				code to be executed;
							   * 
							   * }
							   * 
							   */
		
						int num;
						
						Scanner input=new Scanner (System.in);
						
						System.out.println("Enter your number :  "); 
						
						num=input.nextInt();
						
						if(num>0) {
							
										System.out.println("Positive.");
							
						}
						
						else if (num<0){
							
										System.out.println("Negative.");
							
						}
						
						else {
							
										System.out.println("Your number is : 0 which is neither positive or negative.");
							
						}
		
	}
	
	
}
