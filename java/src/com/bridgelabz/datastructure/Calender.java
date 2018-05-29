package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Calender {
	public static void main(String[] args) {
		// System.out.println("enter month");
		int month = Integer.parseInt(args[0]);
		// System.out.println("enter year");
		int year = Integer.parseInt(args[1]);

		String[][] string = new String[6][7];
		if (month < 1 && month > 12)
			System.out.println("not a valid month");

		String[] months = { "", "january", "february", "march", "april", "may", "june", "july", "august", "september",
				"october", "november", "december" };
		String[] days = {"sun","mon","tue","wed","thu","fri","sat"};
		int day = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				string[i][j] = " ";
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (Utility.dateValidator(day, month, year)) {
					j = (int) Utility.dayOfWeek(day, month, year);
					if (day < 10) {
						string[i][j] = " " + day++;
					} else {
						string[i][j] = "" + day++;
					}
				}
			}
		}
		System.out.println(months[month] +" "+ year);
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			System.out.print(days[i] +" ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(string[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
