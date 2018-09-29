package IterativeAlgo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		n = s.nextInt();
		for(int i=1; i<=n; i++) 
		{
			fact = fact*i;
		}
		System.out.println("Fact is: "+fact);
	}

}
