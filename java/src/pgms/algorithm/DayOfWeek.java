package pgms.algorithm;

import com.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		// take command line arguments
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);

		String[] days = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		// prints day of the week

		int d1 = (int) Utility.dayOfWeek(month, day, year);
		System.out.println(days[(int) d1]);
	}
}
