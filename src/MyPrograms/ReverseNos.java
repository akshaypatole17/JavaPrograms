package MyPrograms;

import java.util.Scanner;

public class ReverseNos {

	public static void main(String[] args) {
		int x;
		int rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x");
		x = s.nextInt();
		while(x!=0) {
			rev = rev*10 + x%10;
			x = x/10;
		}
		System.out.print(rev);
	}

}
