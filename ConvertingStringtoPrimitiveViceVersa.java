package beginnerJava;

import java.util.Scanner;

public class ConvertingStringtoPrimitiveViceVersa {

	public static void main(String[] args) {
		
		//Primitive Datatype - > String.toString method();
		
		int i = 100 ; 
		
		String s = Integer.toString(i);
		
		System.out.println("s = "+s);
		
		boolean b = true;
		
		String x = Boolean.toString(b);
		
		System.out.println("b = "+x);
		
		//String - > Primitive Datatype parseInt()/parseDouble() method:
		
		String p = "32";
		
		int t  =  Integer.parseInt(p);
		
		String o = "32.123456";
		
		double k = Double.parseDouble(o);
		
		System.out.println("o= "+o);
		
		String q = "45";
		
		int r = Integer.valueOf(q);
		
		System.out.println(r);
		
	}
	
}
