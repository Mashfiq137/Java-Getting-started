//Wrapper Class = Converts primitive datatype to object and vice versa.

/*
		 * primitive:
		 * 
		 * boolean
		 * char
		 * byte
		 * short
		 * int 
		 * long
		 * float
		 * double
		 * 
		 * Wrapper class : 
		 * 
		 * Boolean
		 * Character
		 * Byte
		 * Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 * 
		 */

//Autoboxing = converting primitive to object.

//Unboxing = converting object to primitive.

package beginnerJava;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		
			//autoboxing = primitive datatype -> object datatype 
		
			int x = 30;
			
			//valueOf method : 
			
			Integer y = Integer.valueOf(x);  //Double/Float etc
			
			System.out.println(y);
			
			//Or,
			
			Integer z = x ; //compiler here assumes "Integer.valueOf(x)" . This is called Autoboxing.
			
			System.out.println("z = "+z);
			
			//Unboxing = object -> primitive
			
			Double d = new Double (10.25);
			
			System.out.println("d = "+d);
			
			double e = d.doubleValue();
			
			System.out.println("e ="+e);
			
			//Or,
			
			e=d;		//compiler here assumes "d.doubleValue()" . This is called Unboxing.
			
			System.out.println("e = "+e); 
		
	}

}
