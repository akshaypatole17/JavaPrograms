package IterativeAlgo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = s.nextInt();
		int orig = n;
		int rev = 0;
		while(n>0) 
		{
			rev = 10*rev + n%10;
			n = n/10;
		}
		
		if(orig==rev) 
		{
			System.out.println("Nos is Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}

}
