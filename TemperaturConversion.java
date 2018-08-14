package beginnerJava;

import java.util.Scanner;

public class TemperaturConversion {

			public static void main(String[] args) {
				
							Scanner input=new Scanner(System.in);
							
							System.out.println("Enter the temperatur (Celsius) : ");
							
							double C=input.nextDouble();
							
							
							double F=(9/5 * C)+32;
							
							System.out.println("The temperature in Farenheit is  : "+F);
				
			}
	
	
}
