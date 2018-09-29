//WAP to convert milliseconds to minutes seconds.

package BasicPrograms;

import java.util.Scanner;

public class MillisecondsToMinutesSeconds {

	public static void main(String[] args) {
		int tms, tm, ts;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter time in Milliseconds ");
		tms = s.nextInt();
		ts = tms/1000;
		tm = ts/60;
		ts = ts%60;
		System.out.print("Minutes: "+tm+" Seconds: "+ts);
	}

}
