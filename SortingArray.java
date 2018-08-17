package beginnerJava;

import java.util.Arrays;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		
			int [] number= {10,-2,18,5,25};
			
			Arrays.sort(number);
			
			System.out.println("Ascending order : ");
			
			for(int i=0;i<5;i++) {
				
						System.out.print(" "+number[i]);
				
			}
			
			System.out.println();
		
			System.out.println("Descending order : ");
			
			for(int i=4 ; i>=0 ; i--) {
				
						System.out.print(" "+number[i]);
						
			}
			
			System.out.println();
			
			String[] names= {"Pinky","Sujoy","Rizvee","Anis"};
		
			Arrays.sort(names);
			
			System.out.println("Sorted order names : ");
				
			for(int i=0;i<4;i++) {
				
							System.out.println(names[i]);
				
			}
		
	}
	
}
