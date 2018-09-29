package IterativeAlgo;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no to check if it is armstrong no.");
		int x = s.nextInt();
		int temp = x;
		int sum = 0;
		while(x>0) {
			x = x%10;
			x=x/10;
			sum = sum + x*x*x;			
		}
		if(sum==temp) {
			System.out.println("No. is Armstrong");
		}
		else {
			System.out.println("No. is not Armstrong");//asahsgfagafasgfgasfg
		}
	}

}
