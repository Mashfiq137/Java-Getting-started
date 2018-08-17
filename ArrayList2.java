package beginnerJava;

import java.util.Scanner;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		
			ArrayList<Integer> number = new ArrayList<Integer>();
			
			number.add(10);
			
			number.add(20);
			
			number.add(30);
			
			number.add(3,40);
			
			System.out.println("Numbers the arraylist contains are : "+number);
			
			//clear method : removeall()/clear() : 
			
			number.clear();
			
			System.out.println("After clearing arraylist contains : ");
			
			number.add(10);
			
			number.add(20);
			
			number.add(30);
			
			number.add(40);
			
			//to find out if an arraylist is empty or not : returns "true" or "false"
			
			boolean check = number.isEmpty(); //returns true/false : 
			
			System.out.println("Is the arraylist empty? : "+check);
			
			//contains() method : 
			
			boolean contain = number.contains(30); //30 contain kore kina ?
			
			System.out.println("30 is in the list :  "+contain);
			
			//indexof() method : 
		
			int pos = number.indexOf(40);
			
			System.out.println("Index of 40 is  :  "+pos);
			
			//set() & get() method : 
			
			//set() : replaces existing data .
			
			number.set(3, 50); //replaces 40 with 50
			
			System.out.println(number);
			
			//get() : 
			
			int x = number.get(0);
			
			System.out.println("Index 0 = "+x);
	}
	
}

/*Methods : 
 * 
 * size();
 * add();
 * remove();
 * removeAll();
 * clear();
 * isEmpty();
 * contains();
 * indexOf();
 * set();
 * get();
 * equals();
 * addAll();
 * 
 * */
