package Programs;

import java.util.Scanner;

public class PracticeClass 
{

	public static void main(String[] args) 
	{
		int i, n, fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		n=s.nextInt();
		for(i=1; i<=n; i++) 
		{
		fact=fact*i;
		}
		System.out.println("Factorial is "+fact);
	}

}
