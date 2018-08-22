package morejava;

import java.util.Random;

public class RandomNumberGen {

	public static void main(String[] args) {
		
		//program to roll a dice .
		
		Random dice = new Random();
		
		int number;
		
		for(int counter = 1;counter<=10;counter++) {
			
				//nextInt(range of the numbers);
			
				
				number = 1 + dice.nextInt(6);
				
				//adds 1 because we are getting 0 to 5 random numbers.
				
				System.out.println(number + " ");
			
		}
		
	}
	
}
  