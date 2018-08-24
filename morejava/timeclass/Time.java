package timeclass;

public class Time {
	
	private int hour;
	
	private int minute;
	
	private int second;
	
	public void setTime(int h , int m , int s ) {
		
		hour = ((h>=0 && h <24 )?h : 0);
		minute = ((h>=0 && h <60 )?m : 0);
		second = ((h>=0 && h <60 )?s : 0);
	}
	
	//display method : Military method time 
	
	public String toMilitary() {
		
				return String.format("%02d : %02d : %02d",hour , minute,second);
		
	}
	
	//Creating another method to display regular time: (am/pm)
	
	public String toString () {
		
				return String.format("%d : %02d : %02d %s",((hour==0 || hour ==12)?12: hour%12),minute,second,(hour <12?"AM" : "PM" ));
		
	}

}
