//WAP to find cube of a number.

package BasicPrograms;

import java.util.Scanner;

public class CubeOfNos {

	public static void main(String[] args) {
		int x;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		int Cube = x*x*x;
		System.out.println("Cube of Number is "+Cube);
		
		
		
	}

}
