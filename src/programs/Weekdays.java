package programs;

import java.util.Scanner;

public class Weekdays {
  
	
	public static void main(String[] args) {
		//Weekdays weekdy=new Weekdays();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int day=sc.nextInt();
		
		//weekdy.getWeekday(day);
     System.out.println(getWeekday(day));
	}
	public static String getWeekday(int day) {
		
		   String dayname="";
			switch(day) {
			  
			case 1:dayname = "Monday";break;
			case 2:dayname= "Tuesday";break;
			case 3:dayname= "Wednesday";break;
			case 4:dayname= "Thursday";break;
			case 5:dayname= "Friday";break;
			case 6:dayname= "Saturday";break;
			default :dayname= "Invalid day";
			}
			return dayname;
			
		}

}
