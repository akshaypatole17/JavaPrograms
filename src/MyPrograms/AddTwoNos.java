//WAP to add two numbers.

package MyPrograms;

import java.util.Scanner;

public class AddTwoNos {

	public static void main(String[] args) {
		int a, b, sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a = s.nextInt();
		System.out.println("Enter value of b:");
		b = s.nextInt();
		sum = a+b;
		System.out.println("Sum of a & b is " +sum);
		
	}

}
