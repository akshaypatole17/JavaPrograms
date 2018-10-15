package IterativeAlgo;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no to check if it is armstrong no.");
		int x = s.nextInt();
		int temp = x;
		int sum = 0;
		int a;
		while(x>0) {
			a = x%10;
			x = x/10;
			sum = sum + (a*a*a);
		}
		if(sum==temp) {
			System.out.println("No. is Armstrong");
		}
		else {
			System.out.println("No. is not Armstrong");
		}
	}

}
