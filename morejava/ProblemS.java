import java.util.Scanner;

import java.util.Random;

public class ProblemS {

			public static void main(String[] args) {
				
					Scanner input = new Scanner(System.in);
					
					System.out.println("scissor(0), rock(1) ,paper(2) : ");
					
					int x = input.nextInt();
					
					Random rand = new Random();
					
					int p = rand.nextInt(2);
					
					if(x==p) {
					
					if(x==0 && p==0) {
						
								System.out.println("The computer is scissor. You are scissor too. It is a draw.");
						
					}
					
					else if(x==1 && p==1) {
						
						System.out.println("The computer is rock. You are rock too. It is a draw.");
				
					}
					
					else if(x==2 && p==2) {
						
						System.out.println("The computer is paper. You are paper too. It is a draw.");
				
					}
					
							 }
					
					else {
						
						if(x==0 && p==1) {
							
							System.out.println("The computer is rock. You are scissor. You lose");
					
										}
				
						else if(x==0 && p==2) {
					
							System.out.println("The computer is paper. You are scissor. You won");
			
							}
				
						else if(x==1 && p==2) {
					
							System.out.println("The computer is paper. You are rock. You lose");
			
							}
						
						else if(x==1 && p==0) {
							
							System.out.println("The computer is scissor. You are rock. You won");
			
							}
						
						else if(x==2 && p==0) {
							
							System.out.println("The computer is scissor. You are paper. You lose ");
			
							}
						
						else if(x==2 && p==1) {
							
							System.out.println("The computer is rock.You are paper. You won ");
			
							}
						
					}
				
			}
	
}
