package beginnerJava;
import java.util.Scanner; 
public class InputDemo {

				public static void main(String[] args) {
					
									Scanner input=new Scanner(System.in); 
					
									int number;
									
									System.out.print("Enter your number: ");
									
									number=input.nextInt();
									
									System.out.println("Number= "+number);
									
									//string variable
									
									String name="Mashfiq Rizvee";
									
									System.out.println(name);
									
									System.out.println("Enter your name :");
									
									name=input.nextLine();
									
									System.out.println(name);
									
									//double
									
									double num;
									
									System.out.println("Enter a double value :");
									
									num=input.nextDouble();
									
									System.out.println(num);
				
				}
}
