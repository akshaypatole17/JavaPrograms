//WAP to Swap two Numbers without using third variable.
package BasicPrograms;

import java.util.Scanner;

public class SwapTwoNosWithout3Var {
	public static void main(String[]args) 
	{
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		System.out.print("Enter value of y: ");
		y = s.nextInt();
		System.out.println("Before Swapping");
		System.out.println(" X= "+x+" Y= "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After Swapping");
		System.out.println(" X= "+x+" Y= "+y);
		
			
			
		
	}

}
