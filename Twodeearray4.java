package beginnerJava;

import java.util.Scanner;

public class Twodeearray4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
				int [][] A=new int[3][3];
				
				int sumofdiagonal=0;
				
				int sumofupper=0;
				
				int sumoflower=0;
				
				System.out.println("Input elements :  "); 
				
				for(int row=0;row<=2;row++) {
					
					for(int col=0;col<3;col++) {
						
									A[row][col]=input.nextInt();
						
					}
					
				}
		//Sum of diagonal,upper,lower elements : 
				
				for(int row=0;row<=2;row++) {
					
					for(int col=0;col<3;col++) {
						
									if(row==col) {
										
												sumofdiagonal+=A[row][col];
										
									}
						
					}
					
				}
				
				for(int row=0;row<=2;row++) {
					
					for(int col=0;col<3;col++) {
						
									if(row<col) {
										
												sumofupper+=A[row][col];
										
									}
						
					}
					
				}

				for(int row=0;row<=2;row++) {
	
					for(int col=0;col<3;col++) {
		
					if(row>col) {
						
								sumoflower+=A[row][col];
						
								}
		
				    }
	
			    }
				
				System.out.println("Sum of diagonal elements is : "+sumofdiagonal);
				System.out.println("Sum of lower elements is : "+sumoflower);
				System.out.println("Sum of upper elements is : "+sumofupper);
		
	}
	
}
