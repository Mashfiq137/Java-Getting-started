package assignment1;

import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Problem4 {

		public static void main(String[] args) {
			
			TimeZone.setDefault(TimeZone.getTimeZone("IST"));
			
			SimpleDateFormat date_format = new SimpleDateFormat("EEE MMM d hh:mm:ss yyyy");
			
			Date date = new Date();
			
			String current = date_format.format(date);
			
			System.out.println(current);
			 
		}
	
}
