//WAP to find greatest among two nos.

package LogicBuilding;

import java.util.Scanner;

public class GreatestAmongTwoNos {

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		System.out.print("Enter value of y: ");
		y = s.nextInt();
		if(x>y) 
		{
			System.out.println("x is greater.");
		}
		else 
		{
			System.out.println("y is greater.");
		}	
	}

}
