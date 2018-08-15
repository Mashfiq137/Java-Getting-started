package beginnerJava;

import java.util.Scanner;

public class IntroToArray {

	public static void main(String[] args) {
		
				Scanner input=new Scanner(System.in);
				
				int [] number = new int[5];
				
				/*	can also be declared like this : 
				 * 
				 * (array declaration)	int [] number;
						
					(array creation)	number=new int[10];   */
				
				number[0]=10;
				
				number[1]=20;
				
				number[3]=30;
				
				number[4]=40;
				
				//printing elements
	
				
				System.out.println(number[0]);
				
				//Printing arrays size : 
				
				int len= number.length ;
				
				System.out.println("Length of the array is : "+len);
				
				//Sum of all elements : 
				
				int sum=number[0]+number[1]+number[2]+number[3]+number[4];
				
				System.out.println("Sum of all elements is : "+sum);
				
				//creating multiple arrays : 
				
				int[] number1=new int[5];  
				int[] number2=new int[5];
	}
	
}
