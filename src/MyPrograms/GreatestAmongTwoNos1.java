package MyPrograms;

import java.util.Scanner;

public class GreatestAmongTwoNos1 {

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x");
		x = s.nextInt();
		System.out.println("Enter value of y");
		y = s.nextInt();
		if(x>y) 
		{
		System.out.println("Greater Number is: "+x);	
		}
		else 
		{
			System.out.println("greater Nos is: "+y);
		}
	}

}
