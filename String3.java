package beginnerJava;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		
			String f1 = "Mashfiq";
			
			String f2 = " Rizvee";
			
			//normal method to concatenate strings : 
			
			String f3 = f1 + f2 ;
			
			System.out.println("Full name : "+f3+" "+137);
			
			//concatenation method : 
			
			String f4 = f1.concat(f2);
			
			System.out.println("Full name in concat method : "+f4);
			
			//Full name from lower to uppercase : 
			
			String upperName = f3.toUpperCase();
			
			System.out.println("upper name :"+upperName);
			
			//Full name from upper to lowercase : 
			
			String lowerName = f3.toLowerCase();
			
			System.out.println("Lower name : "+lowerName);
			
			//startsWith method : returns a true or a false value : 
			
			boolean b = f1.startsWith("Mas"); //boolean b = f1.startsWith("M/Mas/Mashfiq"); all will return a true value.
			
			System.out.println(" b = "+b);
			
			//endsWith mehod : return a true or a false value : 
			
			boolean last = f2.endsWith("ee");//boolean last = f2.endsWith("zvee/vee/e");	all will return a true value.
			
			System.out.println("Last = "+last);
			
			//extras : 
			
			//Array of a String : 
			
			String[] names = {"Bangladesh","aLAn walker","Rizvee"};
			
			for(String x : names ) {
				
						System.out.println(x);
				
			}
		
	}
}
	

/*Methods in String :
 * 
 * length();
 * equal();
 * equalsIgnoreCase();
 * contains();
 * isEmpty();
 * concat();
 * toUpperCase();
 * toLowerCase();
 * startsWith();
 * endsWith();
 * trim();
 * charAt();
 * indexOf();
 * lastIndexOf();
 * replace();
 * split();
 */
