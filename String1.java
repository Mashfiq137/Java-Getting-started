package beginnerJava;

import java.util.Scanner;

//String  =  Object of sequential characters .

public class String1 {

	public static void main(String[] args) {
		
		String s1 = "Mashfiq Rizvee";
		
		String s2 = new String ("Anisul Islam");
		
		String s4 = "Mashfiq Rizvee";
		
		String s5 = "mashfiq rizVEE";
		
		System.out.println("s1 = "+s1);
		
		System.out.println("s2 = "+s2);
		
		char [] s3 = {'a','i','s'};
		
		System.out.println(s3);
		
		//methods : 
		
		//length() method:To find length of a string
		
		int len = s1.length();
		
		System.out.println("Length of s1 = "+len);
		
		//Finding equivalence : 
		
		//This won't work here because this "==" sign compares the objects,not the value .
		
		/*	if(s1==s2) {
			
					System.out.println("equals");
					
		}
		
		else {
			
					System.out.println("Not equals");
		}
		*/
		
		//equals() method : Compares the value.Result differs if values are not in the same case letter; smaller or upper
		
		if(s1.equals(s4)) {
			
						System.out.println("Equal");
			
		}
		
		else {
			
						System.out.println("Not equals");
		}
		
		//equalsIgnoreCase() method : Compares the value.Result DO NOT differ if values are not in the same case ; smaller or upper.Ignores the fact.
		
		if(s1.equalsIgnoreCase(s5)) {
			
			System.out.println("Equal");

		}

		else {

			System.out.println("Not equals");
		}
		
		//contains() method = Finds Substrings inside a string.returns boolean value.
		
		boolean con = s1.contains("Rizvee");
		
		System.out.println(con);
		
		//isEmpty() method : To find out if the string is empty or not.return boolean value.True if empty.False if otherwise.
		
		boolean b = s1.isEmpty();
		
		System.out.println("b = "+b);
		
	}
	
}
