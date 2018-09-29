// WAP to display length of string.

package StringHandling;

import java.util.Scanner;

public class DisplayLengthOfString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String name = s.nextLine();
		int Len = name.length();
		System.out.println("Length is "+Len);
		
	}

}
