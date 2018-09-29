//WAP to change Fahreinheit to Degree.
package Programs;

import java.util.Scanner;

public class FahrenheittoDegree {

	public static void main(String[] args) {
		int f;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of Temp in Fahreinheit");
		f = s.nextInt();
		double c = (5.0/9.0)*(f-32);
		System.out.println("Value of temp in Degree is "+c);
	}

}
