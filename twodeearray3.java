package beginnerJava;

import java.util.Scanner;

public class twodeearray3 {

	public static void main(String[] args) {
		
				Scanner input=new Scanner (System.in);
		
				int [][] A=new int [2][3];
				
				int [][] B = new int [2][3];
				
				int [][] C = new int [2][3];
				
				System.out.println("Enter your elements A ( 6 ): "); 
				
				for(int row=0; row<2;row++) {
					
							for(int col=0;col<3;col++) {
								
								A[row][col] = input.nextInt();
								
					}
								
					
				}
				
				System.out.println("A matrix :  "); 
				
				for(int row=0; row<2;row++) {
					
					for(int col=0;col<3;col++) {
						
							    System.out.printf(" "+A[row][col]);
						
					}
					
				System.out.println();
				}
				
				System.out.println("Enter your elements B ( 6 ): "); 
				
				for(int row=0; row<2;row++) {
					
							for(int col=0;col<3;col++) {
								
								B[row][col] = input.nextInt();
								
					}
								
					
				}
				
				System.out.println("B matrix :  "); 
				
				for(int row=0; row<2;row++) {
					
					for(int col=0;col<3;col++) {
						
								System.out.printf(" "+B[row][col]);
						
					}
					
				System.out.println();
				
				}
				
				//adding two matrices : 
				
				for(int row= 0 ; row <2 ; row++) {
					
					for(int col=0;col<3;col++) {
								
								
								System.out.print(A[row][col]+B[row][col]);
						
						
				   }
							
								System.out.println();
					
				}
		
	}
	
}

