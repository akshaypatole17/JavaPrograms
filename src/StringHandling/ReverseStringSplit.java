package StringHandling;

public class ReverseStringSplit {

	public static void main(String[] args) {
		String s = "Selenium Webdriver";
		for(String w : s.split(" ")) // Can use \\s also in place of " ".
		{
			for(int i= w.length()-1; i>=0; i--) 
			{
				char c = w.charAt(i); // Can use w.toCharArray() in place of char@().
				System.out.print(c);
			}			
			System.out.print(" ");
		}
	}

}
