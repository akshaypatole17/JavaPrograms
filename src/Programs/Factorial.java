package Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1, i, n ;
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter Number");
		n = s.nextInt();
		
		for(i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is "+ fact);
		s.close();
	}
}
