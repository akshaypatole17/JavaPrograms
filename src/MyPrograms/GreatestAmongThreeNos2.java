package MyPrograms;

import java.util.Scanner;

public class GreatestAmongThreeNos2 {

	public static void main(String[] args) {
		int x,y,z;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		x = s.nextInt();
		System.out.println("Enter value of y: ");
		y = s.nextInt();
		System.out.println("Enter value of z: ");
		z =s.nextInt();
		if (x>y && x>z) 
		{
			System.out.println("Greatest Nos is: "+x);
		}
		else if(y>z)
		{
			System.out.println("Greatest Nos is: "+y);
		}
		else
		{
			System.out.println("Greatest Nos is: "+z);
		}
	}

}
