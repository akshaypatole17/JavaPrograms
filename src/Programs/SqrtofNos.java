package Programs;

import java.util.Scanner;

public class SqrtofNos {

	public static void main(String[] args) {
		int x;
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter value of x");
		x = s.nextInt();
		double Sqrt = Math.sqrt(x);
		System.out.println("Value of Sqrt of x is "+Sqrt);
	}

}
