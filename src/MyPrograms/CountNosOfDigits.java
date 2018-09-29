package MyPrograms;

import java.util.Scanner;

public class CountNosOfDigits {

	public static void main(String[] args) {
		int c=0, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of Nos");
		n = s.nextInt();
		while(n>0) 
		{
			n = n/10;
			c++;
		}
		System.out.println("Nos of Digits is "+c);
	}

}
