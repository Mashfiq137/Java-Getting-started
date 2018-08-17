package beginnerJava;

import java.util.Scanner;

public class Arrayoutput2 {

	public static void main(String[] args) {
		
			int [][] number= new int[4][4];
			
			int k=0;
			
			Scanner input= new Scanner (System.in);
			
			for(int row=0;row<4;row++) {
					
				for(int col=0;col<4;col++) {
								
							if(col<=row) {
								number[row][col]+=k;
								k++;
							}
					
				}
					
				
			}
			
			for(int row=0;row<4;row++) {
				
				for(int col=0;col<4;col++) {
								
							if(col<=row) {
								
								System.out.print(number[row][col]);
								
								
							}
								
					
				}
				
				System.out.println();
					
				
			}
		
	}
	
}
