package programs;

import java.util.Scanner;

public class Pattern1 {
	
	public void patternread() {
		int i,j ,n;
		System.out.println("enter numbers of stars:");
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
      for(i=0;i<n;i++)
		{
			for(j=2*(n-i);j>=0;j--) {
				
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("$ ");
				//System.out.print(" ");
				
			     }
			System.out.print("\n");
		  }
		}

	public static void main(String[] args) {
		
		Pattern1 ptrn=new Pattern1();
		ptrn.patternread();
		
		
	}

}
