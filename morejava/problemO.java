
import java.util.Scanner;

public class problemO {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter three digits :");
		
		a = input.nextInt();
		
		b = input.nextInt();
		
		c = input.nextInt();
		
		int x,y,z;
		
		if(a>=b && a>=c) {
			
					if(b>=c) {
						
								System.out.println(c+" "+b+" "+a);
						
								
					}
					
					else System.out.println(b+" "+c+" "+a);
		}
		
		else if(b>=c && b>=a) {
			
					if(c>=a) {
						
						System.out.println(a+" "+c+" "+b);
								
						
					}
					
					else System.out.println(c+" "+a+" "+b);
			
		}
		
		else {
			
			if(b>=a) {
				
				System.out.println(a+" "+b+" "+c);
						
				
			}
			
			else System.out.println(b+" "+a+" "+c);
				
		}
			
	}
		

}
