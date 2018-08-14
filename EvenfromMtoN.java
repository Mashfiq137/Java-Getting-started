package beginnerJava;

import java.util.Scanner;

public class EvenfromMtoN {
	
	public static void main(String[] args) {
		
				int sum=0;
		
				for(int i=1;i<=10;i++) {
					
								sum+=i;
					
				}
		System.out.println("Sum is  : "+sum);
		
				Scanner input=new Scanner(System.in);
				
				int n,m;
				
				System.out.println("Enter lower bound and upper bound : ");
				
				n=input.nextInt();
				
				m=input.nextInt();
				
				for(int j=n;j<=m;j++) {
					
										System.out.println(j);
					
				}
				
				for(int k=n;k<=m;k++) {
					
										if(k%2==0) {
											
										System.out.println("evens : "+k);
											
										}
					
				}
				
				for(int g=n;g<=m;g++) {
					
					
										if(g%2!=0) {
											
										System.out.println("Odds : "+g);	
											
										}
											
					
					
				}
	}

}
