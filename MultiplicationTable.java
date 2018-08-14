package beginnerJava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
					Scanner input=new Scanner(System.in);
					
					System.out.println("Enter your number :");
					
					int n;
					
					n=input.nextInt();
					
					for(int k=1;k<=n;k++) {
					
					for(int i=1;i<=10;i++) {
						
									
											System.out.println(k+" X "+i+" = "+i*k);
						
					}
					
					}
	
	}
	
}
