//WAP to find sum of n nos.

package IterativeAlgo;

import java.util.Scanner;

public class SumofNosfrom1to10 {

	public static void main(String[] args) {
		int sum=0;
		int x;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n ");
		n = s.nextInt();
		for(x = n; x>=1; x--)
		{
			sum = sum+x;
		}
		System.out.println("Sum is "+sum);
		
	}

}
