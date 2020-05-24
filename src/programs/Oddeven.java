package programs;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		
		if(num%2==0) {
			
			System.out.println("the"+num+"is even number");
			if((num>0)&&(num<10)) {
				System.out.println("HI");
				
			}else if((num>10)&&(num<20)) {
				System.out.println("Hello");
			}
			if(num>20) {
				System.out.println("Bye");
			}
			else {
				System.out.println("The values are not between the number");
			}
		}
		
		
		else {
			System.out.println("the"+num+"is Odd number");
		}
	}
	
	

}
