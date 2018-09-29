//WAP to find even or odd.

package LogicBuilding;

import java.util.Scanner;

public class EvenOddNos {

	public static void main(String[] args) {
		int x;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		if(x%2==0) 
		{
			System.out.println("Nos is even.");
		}
		else 
		{
			System.out.println("Nos is odd.");
		}
	}

}
