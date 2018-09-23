package beginnerJava;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		
					int r;
					
					Scanner input=new Scanner(System.in);
					
					System.out.print("Enter the radius of the circle : ");
					
					r=input.nextInt();
					
					double area=3.1416 * r* r ;
					
					System.out.println("The radius of the circle is : "+area);
		
					
	}
	
}
