package BasicPrograms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		int x;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x to find Sqrt ");
		x = s.nextInt();
		Double Sqrt = Math.sqrt(x);
		System.out.println("Square Root of x is "+Sqrt);
		
		
	}

}
