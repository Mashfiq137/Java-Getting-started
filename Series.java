package beginnerJava;

import java.util.Scanner;

public class Series {
	
	public static void main(String[] args) {
		
				Scanner input=new Scanner(System.in);
				
				int n;
				
				System.out.println("Enter n");
				
				n=input.nextInt();
		
				int sum=0;
				
				for(int i=1;i<=n;i++) {
								
					
										sum+=i;
								
					
				}
				
				System.out.println("Sum is : "+sum);
				
								
				sum=0;
				
				for(int j=1;j<=n;j+=2) {
					
										sum+=j;
					
				}
				
				System.out.println("Sum of odds is : ");
				
				
				double p;
				
				double sum2=0;
				
				p=input.nextDouble();
				
				for(double k=1.5;k<=p;k++) {
					
									
										sum2+=k;
					
				}
				
				System.out.println("Sum2 is : "+sum2);
		
		
	}

}
