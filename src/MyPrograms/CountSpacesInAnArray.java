package MyPrograms;

public class CountSpacesInAnArray {

	public static void main(String[] args) {
		int word=1;
		String str="count the nos of";
		for(int i=0; i<str.length();i++) 
		{
			if(str.charAt(i)==' ') 
			{
				word++;
			}
		}
		System.out.println("No of words "+word);
		System.out.print("No of spaces "+(word-1));
	}

}
