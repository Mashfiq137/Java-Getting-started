package beginnerJava;

import java.util.Scanner;

public class IntroToArray2 {

	public static void main(String[] args) {
		
				Scanner input= new Scanner(System.in);
				
				double[] number= new double[5];
				
				double sum=0;
				
				System.out.println("Enter Five Numbers : ");
				
				//taking input : 
				
/*				number[0]=input.nextDouble();
				number[1]=input.nextDouble();
				number[2]=input.nextDouble();
				number[3]=input.nextDouble();
				number[4]=input.nextDouble();
				
				sum = number[0] +number[1] +number[2] +number[3] +number[4] ;
				
				System.out.println("The sum of all numbers is : "+sum); */
				
				//efficient way to take input : 
				
				sum=0;
				
				for(int i=0;i<number.length;i++) {
					
					number[i]=input.nextDouble();
					
					sum+=number[i];
					
									 }
				
				System.out.println(sum);
				
	}
	
}
