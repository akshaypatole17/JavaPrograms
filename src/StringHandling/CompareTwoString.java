package StringHandling;

import java.util.Scanner;

public class CompareTwoString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String 1");
		String a = s.nextLine();
		System.out.println("Enter String 2");
		String b = s.nextLine();
		if(a.equals(b)) {
			System.out.println("String 1 & 2 are equal");
		}
		else {
			System.out.println("String 1 & 2 are not equal");
		}
	}

}
