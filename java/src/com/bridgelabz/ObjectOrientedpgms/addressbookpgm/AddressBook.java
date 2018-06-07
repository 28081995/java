package com.bridgelabz.ObjectOrientedpgms.addressbookpgm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class AddressBook {

	private static String fname;
	private static String lname;
	private static String address;
	private static String city;
	private static String state;
	private static int zipcode;
	private static long phno;
	PersonList list;
	JSONObject jobj;
	// public AddressBook() {
	// super(fname, lname, address, city, state, zipcode, phno);
	// }
	static Utility u = new Utility();

	public void add() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		Person p = new Person();
		list=new PersonList();
		System.out.println("enter how many person you wish to add");
		int noofpersons = u.inputInteger();
		for (int i = 0; i < noofpersons; i++) {
			System.out.println("enter the person's first name");
			String fname = u.inputString();
			p.setFname(fname);
			System.out.println("enter the person's last name");
			String lname = u.inputString();
			p.setLname(lname);
			System.out.println("enter the person's address");
			String address = u.inputString();
			p.setAddress(address);
			System.out.println("enter the person's city");
			String city = u.inputString();
			p.setCity(city);
			System.out.println("enter the person's state");
			String state = u.inputString();
			p.setCity(state);
			System.out.println("enter the person's zipcode");
			int zipcode = u.inputInteger();
			p.setZipcode(zipcode);
			System.out.println("enter the person's phoneno");
			long phno = u.inputLong();
			p.setPhno(phno);
			// p=new Person(fname, lname, address, city, state, zipcode, phno);
			list = new PersonList();
			// p=new Person();
			
			list.getPlist().add(p);
			System.out.println(list);

			JSONObject jobj = tojsonobject();
			System.out.println(jobj);
			writebook(jobj);
		}
	}

	public JSONObject tojsonobject() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("fname", fname);
		jsonobject.put("lname", lname);
		jsonobject.put("address", address);
		jsonobject.put("city", city);
		jsonobject.put("state", state);
		jsonobject.put("zipcode", zipcode);
		jsonobject.put("phno", phno);

		return jsonobject;
	}

	private void writebook(JSONObject jobj) throws FileNotFoundException, IOException, ParseException {

		ObjectMapper objectmapper = new ObjectMapper();

		objectmapper.writeValue(new File(
				"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/addressbookpgm/addressbook.json"),
				list);
	}

	public void update(JSONObject jobj) {

	}

	public static void edit() {
		System.out.println("enter the first and lastname of person to be edit");
		String fname = u.inputString();
		String lname = u.inputString();

		System.out.println("enter which detail you want to edit: ");
		System.out.println("1. address");
		System.out.println("2, city");
		System.out.println("3, state");
		System.out.println("4, zipcode");
		System.out.println("5, phno");

		int detail = u.inputInteger();

		switch (detail) {
		case 1:
			System.out.println("enter the person's address");
			String address = u.inputString();

			break;
		case 2:
			System.out.println("enter the person's city");
			String city = u.inputString();
			break;
		case 3:
			System.out.println("enter the person's state");
			String state = u.inputString();
			break;
		case 4:
			System.out.println("enter the person's zipcode");
			int zipcode = u.inputInteger();
			break;
		case 5:
			System.out.println("enter the person's phoneno");
			long phno = u.inputLong();
			break;
		default:
			break;
		}
	}

	public static void delete() {

	}

	public static void sortByName() {
		/*
		 * System.out.println("enter no of names"); int num=u.inputInteger(); //String[]
		 * arr=new String[]; for(int i=0;i<list.getPlist().size();i++) { for(int
		 * j=i+1;j<list.getPlist().size();j++) {
		 * 
		 * } }
		 */

	}

	public static void sortByZIP() {

	}

	public static void createNew() {

	}

	public static void open() {

	}

	public static void save() {

	}

	public static void saveAs() {

	}

	public static void print() {
		System.out.println("person details are: " + fname + lname + address + city + state + zipcode + phno);
	}

	public static void quit() {

	}

}
