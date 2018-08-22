package morejava;

//frequency check on an array .

import java.util.Random;

public class Random2 {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int freq [] = new int [7];
		
		for(int roll=1 ; roll < 1000 ; roll++) {
			
				
			++freq[1+rand.nextInt(6)];
			
			//pre-increment is because index starts with zero.
			
		}
		
		System.out.println("Index\tVisits");
		
		for(int face = 1 ;face < freq.length ; face++) {
			
				System.out.println(face+"\t"+freq[face]);
				
		}
		
	}

}
