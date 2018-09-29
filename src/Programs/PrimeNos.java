//WAP to find Prime Nos.
package Programs;

import java.util.Scanner;

public class PrimeNos {

	public static void main(String[] args) {
		int i,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		n = s.nextInt();
		int flag = 0;
		for(i=2; i<=Math.sqrt(n); i++) 
		{
			if(n%i==0) 
			{
			flag =1;	
			}
		}
		if(flag==0) 
		{
			System.out.println(n+" is prime Nos");
		}
		else
		{
			System.out.println(n+" is not prime");
		}	
	}

}
