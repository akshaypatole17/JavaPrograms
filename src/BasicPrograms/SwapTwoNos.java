//WAP to swap two Numbers.

package BasicPrograms;

import java.util.Scanner;

public class SwapTwoNos {

	public static void main(String[] args) {
		int x, y, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		System.out.print("Enter value of y: ");
		y = s.nextInt();
		System.out.println("Before Swapping");
		System.out.println(" X="+x+" Y="+y);
		temp = x; 
		x = y;
		y = temp;
		System.out.println("After Swapping");
		System.out.println(" X="+x+" Y="+y);
		
		
	}

}
