//WAP to find Temperature from Fahreinheit to Degree Celsius.

package BasicPrograms;

import java.util.Scanner;

public class FahreinheitToDegree {

	public static void main(String[] args) {
		int f;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of temp in Fahreinheit ");
		f = s.nextInt();
		double d = (5.0/9.0)*(f-32);
		System.out.print("Value of temp in Degree Celsius is "+d);
	}

}
