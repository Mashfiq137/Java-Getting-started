package beginnerJava;

import java.util.Scanner;

public class String4 {

	public static void main(String [] args) {
		
		
			String country = "Bangladesh is my country.";
			
			
			
			System.out.println(country);
			
			//charAt() method : Finds character at given index .
			
			char ch = country.charAt(0);
			
			System.out.println("ch "+ch);
			
			//codePointAt() method : Returns ASCII value at given index.
			
			int value = country.codePointAt(0);
			
			System.out.println("Value = "+value);
			
			//indexOf() method : Finds index of the given character.
			
			int pos = country.indexOf('n');
			
			System.out.println("First position of n = "+pos);
			
			//lastIndexOf() method : Returns value of the last index of the given character .
 			
			pos = country.lastIndexOf('n');
			
			System.out.println("Last postition of n = "+pos);
			
			//
		
			//trim() method : removes all the Spaces before the first character and after the last character of a string.
			
			String s1 = "     Bangladesh is my country     " ; //lots of space.
			
			System.out.println(s1);
					
			String s2 = s1.trim();
			
			System.out.println(s2);
			
	}
	
}
