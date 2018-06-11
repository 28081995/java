package com.bridgelabz.ObjectOrientedpgms.addresspgm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class AddressBook {
	static String fname;
	static String lname;
	static String address;
	static String city;
	static String state;
	static int zipcode;
	static long phno;
	static Utility u = new Utility();
	static ArrayList<Person> list = new ArrayList<Person>();
	static Person person;
	static AddressBookController abcontrol = new AddressBookController();
	static ObjectMapper objectmapper;
	static File filepath = new File(
			"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/addresspgm/addressbook.json");

	/*public static void createNew() 
	{
		if(filepath.createNewFile())
		{
			System.out.println("file is created");
		abcontrol.option();
	}
		else {
			System.out.println("file already exists");
		abcontrol.option();
		}
	}*/
	public static void add() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter how many person you wish to add");
		int noofpersons = u.inputInteger();

		for (int i = 0; i < noofpersons; i++) {
			System.out.println("enter the person's first name");
			String fname = u.inputString();
			System.out.println("enter the person's last name");
			String lname = u.inputString();
			System.out.println("enter the person's address");
			String address = u.inputString();
			System.out.println("enter the person's city");
			String city = u.inputString();
			System.out.println("enter the person's state");
			String state = u.inputString();
			System.out.println("enter the person's zipcode");
			int zipcode = u.inputInteger();
			System.out.println("enter the person's phoneno");
			long phno = u.inputLong();

			person = new Person(fname, lname, address, city, state, zipcode, phno);
			JSONObject jobj = toJSONobject(person);
			System.out.println(jobj);
			list.add(person);
			writebook(jobj);
		}
		abcontrol.option();
	}


	public static void writebook(JSONObject jobj) throws JsonGenerationException, JsonMappingException, IOException {
      /* System.out.println("do you want to save? then press yes");
       String st=u.inputString();
       if(st=="yes")
       {*/
		objectmapper = new ObjectMapper();
		objectmapper.writeValue(filepath, list);
       //}
	}

	public static JSONObject toJSONobject(Person person) {
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("fname", person.getFname());
		jsonobject.put("lname", person.getLname());
		jsonobject.put("address", person.getAddress());
		jsonobject.put("city", person.getCity());
		jsonobject.put("state", person.getState());
		jsonobject.put("zipcode", person.getZipcode());
		jsonobject.put("phno", person.getPhno());

		return jsonobject;
	}

	static int index;

	public static void edit() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter name of person you want to edit");
		String name = u.inputString();
		boolean b = search(name);
		if (b) {
			System.out.println("enter what do you want to edit");
			System.out.println(
					" 1.address " + "\n" + " 2.city " + "\n" + " 3.state " + "\n" + " 4.zipcode " + "\n" + " 5.phno ");
			int input = u.inputInteger();
			switch (input) {
			case 1:
				System.out.println("enter the new address");
				String address = u.inputString();
				list.get(index).setAddress(address);
				objectmapper.writeValue(filepath, list);
				break;
			case 2:
				System.out.println("enter the new city");
				String city = u.inputString();
				list.get(index).setCity(city);
				objectmapper.writeValue(filepath, list);
				break;
			case 3:
				System.out.println("enter the new state");
				String state = u.inputString();
				list.get(index).setState(state);
				objectmapper.writeValue(filepath, list);
				break;
			case 4:
				System.out.println("enter the new zipcode");
				int zipcode = u.inputInteger();
				list.get(index).setZipcode(zipcode);
				objectmapper.writeValue(filepath, list);
				break;
			case 5:
				System.out.println("enter the new phoneno");
				long phno = u.inputLong();
				list.get(index).setPhno(phno);
				objectmapper.writeValue(filepath, list);
				break;
			default:
				break;

			}

		}
	}

	public static boolean search(String sname)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		for (int i = 0; i < list.size(); i++) {
			if (sname.equals(list.get(i).getFname())) {
				System.out.println("person found and is at position " + i);
				index = i;
				return true;
			}
		}
		abcontrol.option();
		return false;
	}

	public static void delete() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter first name of person you want to delete");
		String name = u.inputString();
		boolean b = search(name);
		if (b) {
			list.remove(index);
			objectmapper.writeValue(filepath, list);
			System.out.println("person deleted");
		}

	}
	public static void sortByName() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object ob = parser.parse(new FileReader(filepath));
				
		JSONArray arr=(JSONArray) ob;
		System.out.println(arr);
		ArrayList<JSONObject>arraylist=new ArrayList<JSONObject>();
		for(int i=0;i<arr.size();i++)
		{
			JSONObject jobj=(JSONObject) arr.get(i);
			arraylist.add(jobj);
		}
		for (int i = 0; i <arraylist.size()-1; i++) {
			for (int j = i + 1; j < arraylist.size(); j++) {
				 
			                JSONObject person1 = (JSONObject)arraylist.get(i);
			                String key1 = (String) person1.get("fname");
			                JSONObject person2 =  (JSONObject) arraylist.get(j);
			                String key2 = (String) person2.get("fname");
			                if (key1.compareTo(key2) > 0) {
			                    JSONObject temp = person1; 
			                    arraylist.set(i, person2);
			                    arraylist.set(j, person1);
			                }
			            }
			        }
		objectmapper.writeValue(filepath, arraylist);
		System.out.println("first name wise sorted");
	}

	public static void sortByZIP() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object ob = parser.parse(new FileReader(filepath));
		JSONArray arr=(JSONArray) ob;
		System.out.println(arr);
		ArrayList<JSONObject>arraylist=new ArrayList<JSONObject>();
		for(int i=0;i<arr.size();i++)
		{
			JSONObject jobj=(JSONObject) arr.get(i);
			arraylist.add(jobj);
		}
		for (int i = 0; i <arraylist.size()-1; i++) {
			for (int j = i + 1; j < arraylist.size(); j++) {
				 
			                JSONObject person1 = (JSONObject)arraylist.get(i);
			                long key1 = (long) person1.get("zipcode");
			                JSONObject person2 =  (JSONObject) arraylist.get(j);
			                long key2 = (long) person2.get("zipcode");
			                if (key1>key2) {
			                    JSONObject temp = person1;
			                    arraylist.set(i, person2);
			                    arraylist.set(j, person1);
			                }
			            }
			        }
		
		objectmapper.writeValue(filepath, arraylist);
		System.out.println("zipcode wise sorted");

	}
	public static void quit() {
     System.exit(0);
	}
}
