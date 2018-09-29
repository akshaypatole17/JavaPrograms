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
			int t = n%10;
			System.out.println(rev);
			System.out.println("t: " + t);
			rev = 10*rev + t;
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
