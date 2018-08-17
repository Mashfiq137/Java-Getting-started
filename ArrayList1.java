/*Differences : 
	 * 
	 * array=static,not resizable
	 * arraylist=dynamic in terms of size,resizable
	 * 
	 * array=for,for each loop
	 * arraylist=for each loop,iterator
	 * 
	 * array=fast
	 * arraylist=slow
	 * 
	 * array=array.length
	 * arraylist=array.size()
	 * 
	 */
	

package beginnerJava;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
			//creating new arraylist : Arraylist<Datatype> new Arraylist<OPTIONAL>(Constructor);
				
			ArrayList<Integer>number = new ArrayList<Integer>(); 
			
			//Printing the size of the ArrayList : 
			
			System.out.println("Size = "+number.size());
			
			//adding elements to an arraylist : 
			
			number.add(10);
			
			number.add(20);
			
			number.add(30);
			
			//second method : add(index number, element you want to add).
			
			number.add(3,40);
			
			//easiest way to print an arraylist : 
			
			System.out.println(number);
			
			System.out.println("Size = "+number.size());
			
			//printing using for each loop :  
			
			System.out.println();
			
			for(int x : number ) {
				
						System.out.print(" "+x);
				
			}
			
			//printing using iterator class : 
			
			System.out.println();
			
			Iterator itr=number.iterator();
			
			while(itr.hasNext()) {
				
						System.out.print(" "+itr.next());
				
			}
			
			//To remove elements : 
			
			number.remove(2);
			
			System.out.println("after removing the array is : ");
			
			System.out.print(number);
			
			//To remove all data at once  : 
			
			number.removeAll(number);
			
			System.out.println(number);
	}
	
}
