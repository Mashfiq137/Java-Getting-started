//For each loop or enhanced for loop

package beginnerJava;

import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		//no need to mention the size
		
			String[] names= {"Anis","Suparna","Pinky","Shahed"};
			
			//names.length=4 ;
			
			
		//or	String[] names= new String[4];
			
			
		/*	names[0]="Anis";
			names[1]="Suparna";
			names[2]="pinky";
			names[3]="Shahed";
			
			*/
			
			//for loop : 
					
			for(int i=0;i<4;i++) {
				
						System.out.println(names[i]);
				
			}
			
			//"For each" loop  or "Enhanced for loop": 
			
			for(String x : names) {
				
						System.out.println(x);
				
			}
		
	}
	
}
