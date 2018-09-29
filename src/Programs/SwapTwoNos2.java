package Programs;

import java.util.Scanner;

public class SwapTwoNos2 {

	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a = s.nextInt();
		System.out.println("Enter value of b:");
		b = s.nextInt();
		System.out.print("Before Swapping");
		System.out.println(" a="+a+ " b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After Swapping");
		System.out.println(" a="+a+" b="+b);
		
	}

}
