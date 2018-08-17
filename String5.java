package beginnerJava;

public class String5 {
	
	public static void main(String [] args) {
		
		
				String s1 = "This is my country.";
				
				//replace() method : replaces a letter with another (all)
				
				String s2 = s1.replace('i', 'j');
				
				System.out.println(s2);
		
				//split() method : Divide a string into substrings .Takes in the character from where it starts to split.
				
				String[] s3=s1.split(" ");
				
				for(String x : s3) {
					
							System.out.println(x);
				}
	}

}
