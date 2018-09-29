//WAP to find area of circle.

package BasicPrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		int r;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter value of r: ");
		r = s.nextInt();
		double area = 3.14*r*r;
		System.out.println("Area of Circle is "+area);
			
		
	}

}
