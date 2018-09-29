//WAP to check given no is prime or not.

package IterativeAlgo;

import java.util.Scanner;

public class PrimeNos {

	public static void main(String[] args) {
		int n;
		int flag=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		n = s.nextInt();
		for(int i=2; i<=Math.sqrt(n); i++) 
		{
			if(n%i==0) 
			{
				flag=1;
				break;
			}
		}
		if(flag==0) 
		{
			System.out.println("No is prime");
		}
		else		
		{
			System.out.println("No is not prime");
		}
	}

}
