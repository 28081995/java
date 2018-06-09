package com.bridgelabz.ObjectOrientedpgms.addresspgm;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class AddressBookController {
	static Utility u = new Utility();
	static AddressBook book = new AddressBook();

	public static void main(String[] args)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		option();
	}

	public static void option() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter what you want to do");
		System.out.println("press" + "\n" + "1. to add" + "\n" + "2. edit " + "\n" + "3. delete " + "\n"
				+ "4. sortbyName" + "\n" + "5. sortbyZip" + "\n" + "6. createnew " + "\n" + "7. open "+ "\n" +"8. quit");
		int choice = u.inputInteger();
		switch (choice) {
		case 1:
			book.add();
			break;
		case 2:
			AddressBook.edit();
			break;
		case 3:
			AddressBook.delete();
			break;
		case 4:

			AddressBook.sortByName();
			break;
		case 5:
			AddressBook.sortByZIP();
			break;
		case 6:
			AddressBook.quit();
			break;
		default:
			break;

		}

	}

}
