//WAP to copy one string to another.

package StringHandling;

import java.util.Scanner;

public class CopyOneStringtoAnother {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Original String: ");
		String s1 = s.nextLine();
		String s2 = s1;
		System.out.println("Copied String is: "+s2);
	}

}
