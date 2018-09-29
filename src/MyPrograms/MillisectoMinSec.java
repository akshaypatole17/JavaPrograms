package MyPrograms;

import java.util.Scanner;

public class MillisectoMinSec {

	public static void main(String[] args) {
		int tms, tm, ts;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value in ms");
		tms = s.nextInt();
		ts = tms/1000;
		tm = ts/60;
		ts = ts%60;
		System.out.println("Time "+tm+ ":" +ts);
		
	}

}
