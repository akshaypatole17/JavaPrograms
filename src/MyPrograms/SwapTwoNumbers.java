//WAP to swap two numbers.
package MyPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a, b, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of a: ");
		a = s.nextInt();
		System.out.println("Enter Value of b: ");
		b = s.nextInt();
		System.out.println("Before Swapping");
		System.out.println("A=" +a+" B="+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Before Swapping");
		System.out.println("A=" +a+" B="+b);
	}

}
