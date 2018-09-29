//WAP to find greatest among two using Ternary Nos.

package BasicPrograms;

import java.util.Scanner;

public class GreatestAmongTwoUsingTernaryNos {

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		System.out.print("Enter value of y: ");
		y = s.nextInt();
		int z = x>y?x:y;
		System.out.println("Greatest Nos is "+z);
		

	}

}
