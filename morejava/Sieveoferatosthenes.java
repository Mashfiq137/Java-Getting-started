import java.util.Arrays;
import java.util.Scanner;

import java.lang.*;

public class Sieveoferatosthenes {
	
	public static void main(String[] args) {
		
		int [] array = new int [9999999];
		
		Arrays.fill(array,0,99999,0);
		
		Scanner input = new Scanner(System.in);
		
		int i,j,N=99999,n;
		
		double x;
		
		x = Math.sqrt(N);
		
		array[0]=1;
		array[1]=1;
		
		for(i=4;i<N;i+=2) array[i]=1;
		
		for(i=3;i<=x;i++) {
			
			if(array[i]==0) {
				
							for(j = i*i ;j<=N;j+=i) array[j]=1;
				
			}
			
		}
		
		System.out.print("Enter your number: ");
		
		n = input.nextInt();
		
		if(array[n]==0) System.out.println("Prime");
		
		else System.out.println("Not Prime");
	}
	
	
}
