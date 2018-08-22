package morejava;

public class ArraysinMethods {

	public static void main(String[] args) {
		
		int ara[] = {3,4,5,6,7,8};
	
		//Calling the method : 
		
		china(ara);
		
		
		
		System.out.println("Our new array is : ");
		
		//using enhanced for loop : 
		
		for(int y : ara) {
					
					System.out.println(y);
					
		}
		
	}
	
	//building a method : 
	
	public static void china(int x [] ) {
		
		for(int counter  = 0 ; counter < x.length;counter++)
			x[counter]+=5;
	
	}
	
}
