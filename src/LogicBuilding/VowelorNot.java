//WAP to find whether char is vowel or not.

package LogicBuilding;

import java.io.IOException;
import java.util.Scanner;

public class VowelorNot {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a char ");
		char x = (char)System.in.read();
		if(x=='a' || x =='e' || x=='i' || x=='o' || x =='u' ) 
		{
			System.out.println("Char is Vowel");
		}
		else if(x=='A' || x=='E' || x=='I' || x=='O' || x =='U') 
		{
			System.out.println("Char is Vowel");
		}
		else 
		{
		    System.out.println("Char is Consonent");	
		}
	}

}
