package com.bridgelabz.ObjectOrientedpgms.addresspgm;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class AddressBookController {
	static Utility u = new Utility();

	public static void main(String[] args)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		option();
	}

	public static void option() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter what you want to do");
		System.out.println("press" + "\n" + "1. createnew " + "\n" + "2. add" + "\n" + "3. edit " + "\n" + "4. delete "
				+ "\n" + "5. sortbyName" + "\n" + "6. sortbyZip" + "\n" + "7. quit");
		int choice = u.inputInteger();
		switch (choice) {
		case 1:
			AddressBook.add();
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
