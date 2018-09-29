//WAP to concat two strings.

package StringHandling;

import java.util.Scanner;

public class ConcateString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String s1 = s.nextLine();
		System.out.print("Enter String2: ");
		String s2 = s.nextLine();
		String s3 = s1.concat(s2);
		System.out.println("Concat String is "+s3);
	}

}
