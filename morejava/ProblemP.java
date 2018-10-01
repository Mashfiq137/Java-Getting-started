
import java.util.Scanner;

public class ProblemP {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("Enter Today's day:");
		
		x = input.nextInt();
		
		System.out.print("Enter then number of days elapsed since today:");

		y = input.nextInt();
		
		switch(x){

        case 0 : System.out.print("Today is Sunday ");

        break;

        case 1 : System.out.print("Today is Monday ");

        break;

        case 2 : System.out.print("Today is Tuesday ");

        break;

        case 3 : System.out.print("Today is Wednesday ");

        break;

        case 4 : System.out.print("Today is Thursday ");

        break;

        case 5 : System.out.print("Today is Friday ");

        break;

        default : System.out.print("Today is Saturday ");

        }



          if(y>=6){

          while(y>=6){

                  y=y-7;

              }

          }

          if(x!=0) y+=1;

          
          
          switch(y){

          case 0 : System.out.print("and the future day is Sunday ");

          break;

          case 1 : System.out.print("and the future day is Monday ");

          break;

          case 2 : System.out.print("and the future day is Tuesday ");

          break;

          case 3 : System.out.print("and the future day is Wednesday ");

          break;

          case 4 : System.out.print("and the future day is Thursday ");

          break;

          case 5 : System.out.print("and the future day is Friday ");

          break;

          default : System.out.print("and the future day is Saturday ");

          }
         



		
	}

}
