package StringHandling;

import java.util.Scanner;

public class CountTotalVowelsInString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = s.nextLine();
		char a;
		int count = 0;
		for(int i=0;i<s1.length();i++) {
			a = s1.charAt(i);
			if(a=='A'|| a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				count++;
			}			
		}
			System.out.println("No of Vowels are:"+count);
	}

}
