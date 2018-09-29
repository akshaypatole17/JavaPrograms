package MyPrograms;

public class HelloWorld2 {
	public void akki()
	{
		System.out.println("HelloWorld!");
	}

	public static void main(String[] args) {
		 HelloWorld2 b = new HelloWorld2();
		 b.akki();		

	}

}

	class akki2 extends HelloWorld2{
		 public static void main(String[]args) {
			 akki2 c = new akki2();
			 c.akki();
			 System.out.println("xxxxxxxx");
			
		}
		
	}
