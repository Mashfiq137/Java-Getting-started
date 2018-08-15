package beginnerJava;

import java.util.Scanner;

public class Patterns1 {
	
	public static void main(String[] args) {
		
			Scanner input=new Scanner(System.in);
			
			int n;
			
			System.out.println("Enter number of rows : ");
			
			n=input.nextInt();
			
			for(int i=1;i<=n;i++) {
				
							for(int j=1;j<=n;j++) {
								
													if(j<=i) System.out.printf("*");
													
													else System.out.printf(" ");
								
							}
				System.out.println("");
			}
		
		
	}

}
/*Variations 
 * in patterns 
 * can be
 *  found in 
 * C repository 
 * 
 * 
 * 
 * */

