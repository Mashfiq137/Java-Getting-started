package beginnerJava;

import java.util.Scanner;

public class ArrayFindingMaxAndMin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] number = new double[5] ;

		double sum = 0;

		System.out.println("Enter Five Numbers : ");

		sum = 0;

		for (int i = 0; i < number.length; i++) {

			number[i] = input.nextDouble();

			sum += number[i];

		}

		System.out.println(sum);

	
	
		//extended : Finding Max and Min
	
	    double max = number [0] ;
	 
		for(int j = 1 ; j < number.length ;j++) {
			
					if(max<number[j]) {
						
										max=number[j];
						
					}
			
		}
		
		System.out.println(max);

}
	
}
