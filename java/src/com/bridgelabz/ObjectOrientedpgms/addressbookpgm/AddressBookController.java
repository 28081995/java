package com.bridgelabz.ObjectOrientedpgms.addressbookpgm;

import com.bridgelabz.utility.Utility;

public class AddressBookController {
	public static void main(String[] args) {
		Utility u = new Utility();
		AddressBook book=new AddressBook();
		System.out.println("enter what you want to do");
		System.out.println("press 1 to add," + " 2 edit, " + "3 delete, " + "4 sortbyName," + " 5 sortbyZip, "
				+ "6 createnew, " + "7 open ");
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
			AddressBook.createNew();
			break;
		case 7:
			AddressBook.open();
			break;
		case 8:
			AddressBook.save();
			break;
		case 9:
			AddressBook.saveAs();
			break;
		case 10:
			AddressBook.print();
			break;
		case 11:
			AddressBook.quit();
			break;

		}
	}

}
