package beginnerJava;
import java.util.Scanner;
public class Arrayoutput1 {

	public static void main(String[] args) {
		
				int [][] number = new int [4][5];
				
				int k=0;
				
				for(int row=0;row<4;row++) {
						
						for(int col=0;col<5;col++) {
							
										number[row][col] = k;
							
										k++;
						}
					
				}
				
				System.out.println("Printing elements : "); 
				
				for(int row=0;row<4;row++) {
					
					for(int col=0;col<5;col++) {
						
							System.out.printf(" "+number[row][col]);
						
					}
				
					System.out.println();
					
			}
	
		
		
	}
	
}
