package programs;

import java.util.Scanner;

public class Greatestnum {

	public void gretestNumber() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("The user numbers are:");
		int user1=sc.nextInt();
		int user2=sc.nextInt();
		int user3=sc.nextInt();
		
		if(user1>user2 && user1>user3) {
			System.out.println("the user1 is greter:  " +user1);
		}
		else if(user2>user1 && user2>user3)
		{
			System.out.println("the user2 is gretaer: " +user2);
		}
		else
		{
			System.out.println("the user3 is greter:  " +user3);
		}
	}
	public static void main(String[] args) {
		
        Greatestnum greter=new Greatestnum();
        		greter.gretestNumber();
	}

}
