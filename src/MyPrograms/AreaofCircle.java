//WAP to find area of circle.
package MyPrograms;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		int r;
		double area;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of r");
		r = s.nextInt();
		area = (3.14*r*r);
		System.out.println("Area of Cirle = "+area);
		
		
	}

}
