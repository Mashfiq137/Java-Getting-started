package morejava;
import java.util.Scanner;
public class pyramid {
	
	public static void main (String[] args)
	{    System.out.println("Enter the number of rows");
	
	Scanner var= new Scanner(System.in);
	int x= var.nextInt();
	
	
	
	
	for (int u=1;u<=x;u++)
	{  
		
		for(int k=x;k>=u;k--)
		{System.out.print(" ");}
		for(int v=1;v<=u;v++)
	{   
			
			
		System.out.print("* ");
	}
	System.out.println();
	}
	
}
}
