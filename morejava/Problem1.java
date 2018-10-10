package assignment1;

import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("Enter first number : ");
		
		x = input.nextInt();
		
		System.out.print("Enter second number : ");
		
		y = input.nextInt();
		
		int sum = x+y;
		
		System.out.println(x+" + "+y+" = "+sum);
		
		int sub = x-y;
		
		System.out.println(x+" - "+y+" = "+sub);
		
		int mul = x*y;
		
		System.out.println(x+" X "+y+" = "+mul);
		
		float div = x/y;
		
		System.out.printf("%d / %d =%.0f\n",x,y,div);
		
		int mod = x % y ;
		
		System.out.println(x+" mod "+y+" = "+mod);
				
	}

}
