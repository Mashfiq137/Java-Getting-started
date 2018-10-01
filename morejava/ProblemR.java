
import java.util.Scanner;


public class ProblemR {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates : ");
		
		int x,y;
		
		x = input.nextInt();
		
		y = input.nextInt();
		
		if(x<=5 && y<=2.5 && x>=-5 && y>=-2.5) System.out.println("Point ("+x+".0,"+y+".0) is in the rectangle");
		
		else System.out.println("Point ("+x+".0,"+y+".0) is not in the rectangle");
		
	}
	
}
