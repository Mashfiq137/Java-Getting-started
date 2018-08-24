package timeclass;

public class test {

			public static void main(String[] args) {
				
				
				Time ob = new Time();
				
				System.out.println(ob.toMilitary());
				
				ob.setTime(13, 27, 6);
				
				System.out.println(ob.toMilitary());
				
				System.out.println("Displaying regular time : ");
				
				System.out.println(ob.toString());
				
				ob.setTime(18, 27, 6);
				
				System.out.println(ob.toMilitary());
				
				System.out.println("Displaying regular time : ");
				
				System.out.println(ob.toString());
				
				
			}
	
}
