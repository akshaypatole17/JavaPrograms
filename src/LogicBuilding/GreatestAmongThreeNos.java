package LogicBuilding;

import java.util.Scanner;

public class GreatestAmongThreeNos {

	public static void main(String[] args) {
		int x, y, z;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		x = s.nextInt();
		System.out.print("Enter value of y: ");
		y = s.nextInt();
		System.out.print("Enter value of z: ");
		z = s.nextInt();
		if(x>y && x>z) 
		{
			System.out.println("x is greater");
		}
		else if(y>z) 
		{
			System.out.println("y is greater");
		}
		else 
		{
			System.out.println("z is greater");
		}
	}

}
