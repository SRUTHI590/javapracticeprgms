package programs;

import java.util.Scanner;

public class Minuttescon {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the minutes:");
		double min=sc.nextDouble();
		
		long years=(long)(min/(60*24*365));
		long days=(long)(min/60/24)%365;
		
		System.out.println(min +"is aroximately"+years+"years and days"+days);
		
		System.out.println("the years are"+years);
		System.out.println("The dyas are:"+days);
		
		
	}

}
//years=(minutes/(seconds*hours*days))
//days=(minutes/seconds/hours)%365