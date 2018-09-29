package MyPrograms;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		int fact=1, x, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n to find fact");
		n = s.nextInt();
		for(x=1; x<=n; x++) 
		{
			fact = fact * x;
		}
		System.out.println("Factorial is: "+fact);
		
	}

}
