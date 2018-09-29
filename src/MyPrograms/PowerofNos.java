package MyPrograms;

import java.util.Scanner;

public class PowerofNos {

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Base");
		x = s.nextInt();
		System.out.println("Enter Power");
		y = s.nextInt();
		double r = Math.pow(x, y);
		System.out.println("Result is "+r);
		
		
		
	}

}
