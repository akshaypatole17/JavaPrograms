//WAp to find x power y.

package BasicPrograms;

import java.util.Scanner;

public class xPowery {

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Base ");
		x = s.nextInt();
		System.out.print("Enter Power ");
		y = s.nextInt();
		double z = Math.pow(x, y);
		System.out.println("Value of x power y is "+z);
	}

}
