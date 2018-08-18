package beginnerJava;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
				String s1 = "Madam" ; 
				
				StringBuffer sb = new StringBuffer(s1);
				
				//toString method = Converts string buffer to String. 
				
				String s2 = sb.reverse().toString() ;
				
				//uppercase lowercase issue : 
				
				if(s1.equalsIgnoreCase(s2)) {
					
							System.out.println("Palindrome");
							
				}
				
				else {
					
							System.out.println("Not Palindrome.");
					
				}
				
				
	}
	
}
