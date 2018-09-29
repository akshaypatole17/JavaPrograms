//WAP to find difference between two nos. Difference must be positive.

package BasicPrograms;

import java.util.Scanner;

public class DifferenceBetweenTwoNos {

	public static void main(String[] args) {
		int x, y, z;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		System.out.print("Enter value of y: ");
		y = s.nextInt();
		z = x>y?x-y:y-x;
		System.out.println("Difference is "+z);
	}

}
