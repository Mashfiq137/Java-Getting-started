package beginnerJava;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
					Scanner input= new Scanner (System.in);
					
					char ch;
					
					System.out.println("Enter any letter : ");
					
					ch=input.next().charAt(0);  //zeroth position in a string or we can simply input a single character.
					
					if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='U' ||ch=='O' ||ch=='I' ||ch=='E' ||ch=='A' ) {
						
								System.out.println("Vowel");
						
					}
					else {
						
								System.out.println("Consonant");
						
					}
					
	}
	
	
}

/*  if (condition1 && condition2) {
 * 
 * 
 * 				code to be executed if both are true
 * 
 * }
 * 
 * if(condition1 || condition2 ){
 * 
 * 				code to be executed if one of the two is true 
 * 
 * }
*/

