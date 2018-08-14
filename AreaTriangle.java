package beginnerJava;

import java.util.Scanner;

public class AreaTriangle {

		public static void main(String [] args) {
			
					double area;
					
					int height,base;
					
					Scanner input=new Scanner(System.in);
					
					System.out.print("Enter height : ");
					
					height=input.nextInt();
					
					System.out.print("Enter base : ");
					
					base=input.nextInt();
					
					area=(double) 0.5*base*height;
					
					System.out.println("Area of the triangle is : "+area);
			
					
		}
	
	
}
