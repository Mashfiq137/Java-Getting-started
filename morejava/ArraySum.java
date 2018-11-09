package morejava;
import java.util.Scanner;
public class ArraySum {

	static int sum = 0;

	public static void main(String[] args) {

		int p[] = new int[6];

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 6 numbers : ");

		for (int counter = 0; counter < 6; counter++) {

			p[counter] = input.nextInt();

		}

		for (int counter = 0; counter < 6; counter++) {

			sum = sum + p[counter];

		}

		System.out.println(sum);
		
	}

}
