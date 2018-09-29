package MyPrograms;

import java.util.Scanner;

public class DiffBetweenTwoNos {

	public static void main(String[] args) {
		int x, y ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x:");
		x = s.nextInt();
		System.out.println("Enter value of y");
		y = s.nextInt();
		int r = (x>y)?(x-y):(y-x); //If x>y then r=x-y else r=y-x
		System.out.println("Difference is: "+r);
				
	}

}
