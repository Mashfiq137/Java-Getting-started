package beginnerJava;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		
				
				ArrayList<Integer> number = new ArrayList<>();
				
				
				number.add(20);
				number.add(-3);
				number.add(18);
				number.add(-219);
				number.add(92);
				number.add(4000);
				
				System.out.println("Before sorting : "+number);
				
				//ascending order : 
				
				Collections.sort(number);
				
				System.out.println("After sorting (In ascending order): "+number);
				
				//descending order : 
				
				Collections.sort(number,Collections.reverseOrder());
				
				System.out.println("After sorting (In descending order):"+number);
		
	
	}
	
}
