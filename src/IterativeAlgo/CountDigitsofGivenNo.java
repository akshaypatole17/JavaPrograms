//WAP to count no of digits in no.

package IterativeAlgo;

import java.util.Scanner;

public class CountDigitsofGivenNo {

	public static void main(String[] args) {
		int n, c=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no to count digits: ");
		n = s.nextInt();
		while(n>0) 
		{
			n=n/10;
			c++;
		}
		System.out.println("No of digit is "+c);
	}

}
