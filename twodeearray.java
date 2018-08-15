package beginnerJava;

public class twodeearray {

	public static void main(String[] args) {
		
			int [][] number = new int [2][3];
			
			number[0][0] = 10;
			number[0][1] = 20;
			number[0][2] = 30;
			number[1][0] = 40;
			number[1][1] = 50;
			number[1][2] = 60;
			
			//Printing elements : 
			
			System.out.println(number[0][0]);
			System.out.println(number[0][1]);
			System.out.println(number[0][2]);
			System.out.println(number[1][0]);
			System.out.println(number[1][1]);
			System.out.println(number[1][2]);
			
			//Printing elements in form of a matrix using for loop : 
			
			for(int row=0;row < 2 ; row++) {
				
							for(int col=0 ; col<3;col++) {
								
											System.out.printf(" "+number[row][col]);
								
							}
				System.out.println();
			}
		
	}
	
}
