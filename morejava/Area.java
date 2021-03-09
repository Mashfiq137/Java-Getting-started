import java.util.Scanner;


		class Calling {
			public static void main(String[] args){
				System.out.println(" Area Calculator \n  S -- Square \n  R -- Rectangle \n  C -- Circle");
				Scanner letterofshape = new Scanner (System.in);
				char letter = letterofshape.next().charAt(0);
			switch(letter)
			{
			case 's' :
					assignment2 ob = new assignment2();
					ob.sq();
					break;
			case 'r':
					assignment2 ob1 = new assignment2();
					ob1.rec();
					break;
			case 'c':
					assignment2 ob2 = new assignment2();
					ob2.cir();
					break;
			default:
			System.out.println("Invalid Input, please try again");
			break;
	 	   }
		  }
		}

		class assignment2{
			private void square() {
				float l;
				System.out.println("Enter length of the side of your square: ");
				Scanner sc = new Scanner(System.in);
				l = sc.nextFloat();
				double squarearea = (l*l);
				System.out.println("Area of your square is: " +  squarearea);
			}
			private void rectangle() {
				float w;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter width of your rectangle: ");
				w = sc.nextFloat();
				float l;
				System.out.println("Enter length of your rectangle: ");
				l = sc.nextFloat();
			    float rectangle = (l * w);
			    System.out.println("Area of your rectangle is: " +  rectangle);
			}
			private void circle() {
				float PI ;
				PI = 3.14f;
				float r;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter radius of your circle: ");
				r = sc.nextFloat();
				float circlearea = PI * (r * r);
				System.out.println("Area of your rectangle is: " +  circlearea);
			}
			void sq(){
           		square();
           	}
           	void rec(){
           		rectangle();
           	}
           	void cir(){
           		circle();
           	}
        }


