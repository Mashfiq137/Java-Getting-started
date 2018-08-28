package beginnerJava;

import java.util.Scanner;

public class BinohConversion {

	public static void main(String [] args) {
		
				int dec = 15 ; //Or take an input from the user.
				
				//Decimal to binary : 
				
				String binary = Integer.toBinaryString(dec);		//conversion to binary string
				
				System.out.println(binary);
		
				//Decimal to octal : 
				
				String oc = Integer.toOctalString(dec);
				
				System.out.println(oc);
				
				//Decmal to hexadecimal :
				
				String hex = Integer.toHexString(dec);
				
				System.out.println(hex);
				
				
	}
	
}
