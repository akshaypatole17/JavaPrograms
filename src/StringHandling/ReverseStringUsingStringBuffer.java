package StringHandling;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		String s = "Selenium";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("Reverse of String is: " +sb);
	}

}
