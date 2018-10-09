package assignment1;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
		
		String s;
		
		System.out.println("The string is : ");
		
		s = input.nextLine();
		
		int x = s.length();
		
		char array[] = new char[x];
		
		s.getChars(0, x, array, 0);
		
		for(int i = 0;i<x;i++) {
			
			if((array[i]>='a' && array[i]<='z') || (array[i]>='A' && array[i]<='Z') ) {
				
						cnt1++;
				
			}
			
			
			else if(array[i]==' ') {
				
						cnt2++;
				
			}
			
			else if(array[i]>='0' && array[i]<='9') {
				
				  	 	cnt3++;
				
			}
			
			else cnt4++;
		}
		
		System.out.println("letter : "+cnt1);
		System.out.println("space : "+cnt2);
		System.out.println("number : "+cnt3);
		System.out.println("other : "+cnt4);
		}
		
		
	}
	

