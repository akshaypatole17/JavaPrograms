//WAP to find greatest among two nos.
package MyPrograms;

import java.util.Scanner;

public class GreatestAmongTwo {

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		x = s.nextInt();
		System.out.println("Enter value of y: ");
		y = s.nextInt();
		int r = (x>y)?x:y; //If x>y then r=x else r=y.
		System.out.println("Greatest among two is "+r);
		
		
		
	}

}
