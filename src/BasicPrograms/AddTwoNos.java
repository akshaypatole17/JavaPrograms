//WAP to Add two Number.

package BasicPrograms;

import java.util.Scanner;

public class AddTwoNos {

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		System.out.print("Enter value of y: ");
		y = s.nextInt();
		int sum = x + y;
		System.out.println("Sum is "+sum);
	}

}
