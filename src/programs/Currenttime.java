package programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Currenttime {

	public static void main(String[] args) {
		
		SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date=new Date();
		String Currentdate=simple.format(date);
		System.out.println("The current date and time is:"  +Currentdate);

	}

}
