package IterativeAlgo;

import java.util.Scanner;

public class XpowerY {

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of No.");
		x = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of Power");
		y = s1.nextInt();
		int res = 1;
		for (int i=1; i<=y; i++) {
			res = res*x;	
		}
		System.out.println("Result is "+res);
		
	}

}
