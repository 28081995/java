package com.bridgelabz.ObjectOrientedpgms.addressbookpgm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class AddressBook extends Person{
	
	private static String fname;
	private static String lname;
	private static String address;
	private static String city;
	private static String state;
	private static int zipcode;
	private static long phno;
	static Person p;
	static PersonList list=new PersonList();
	JSONObject jobj;
	public AddressBook() {
		super(fname, lname, address, city, state, zipcode, phno);
	}
	
	static Utility u=new Utility();
	public void add() throws JsonGenerationException, JsonMappingException, IOException, ParseException
	{
		System.out.println("enter how many person you wishto add");
		int noofpersons=u.inputInteger();
		for(int i=0;i<noofpersons;i++)
		{
		System.out.println("enter the person's first name");
		String fname=u.inputString();
		setFname(fname);
		System.out.println("enter the person's last name");
		String lname=u.inputString();
		setLname(lname);
		System.out.println("enter the person's address");
		String address=u.inputString();
		setAddress(address);
		System.out.println("enter the person's city");
		String city=u.inputString();
		setCity(city);
		System.out.println("enter the person's state");
		String state=u.inputString();
		setCity(state);
		System.out.println("enter the person's zipcode");
		int zipcode=u.inputInteger();
		setZipcode(zipcode);
		System.out.println("enter the person's phoneno");
		long phno=u.inputLong();
		setPhno(phno);
		
		 p=new Person(fname, lname, address, city, state, zipcode, phno);
		
		list.getPlist().add(p);
		}
		JSONObject jobj=p.tojsonobject();
		System.out.println(jobj);
		writebook(jobj);
	}
	private void writebook(JSONObject jobj) throws FileNotFoundException, IOException, ParseException {
		
		ObjectMapper objectmapper=new ObjectMapper();
		
		objectmapper.writeValue(
				new File("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/addressbookpgm/addressbook.json"),list);
		//JSONParser parser=new JSONParser();
     	//Object ob = parser.parse(new FileReader("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/addressbookpgm/addressbook.json"));
		//JSONObject jsonObject = (JSONObject) ob;
		
	}
	public void update(JSONObject jobj)
	{
		
	}
	
	public static void edit()
	{
		System.out.println("enter the first and lastname of person to be edit");
		String fname=u.inputString();
		String lname=u.inputString();
		
		System.out.println("enter which detail you want to edit: ");
		System.out.println("1. address");
		System.out.println("2, city");
		System.out.println("3, state");
		System.out.println("4, zipcode");
		System.out.println("5, phno");
		
		int detail=u.inputInteger();
		
		switch(detail)
		{
		case 1:System.out.println("enter the person's address");
		       String address=u.inputString();
		       setAddress( address);
		       break;
		case 2:System.out.println("enter the person's city");
		       String city=u.inputString();
		       break;
		case 3:System.out.println("enter the person's state");
		       String state=u.inputString();
			   break;
		case 4:System.out.println("enter the person's zipcode");
		       int zipcode=u.inputInteger();
		       break;
		case 5:System.out.println("enter the person's phoneno");
		       long phno=u.inputLong();
		       break;
		       default: 
		    	   break;
		}
		
		
		
		
	}
	public static void delete()
	{
		
	}
	public static void sortByName()
	{
		
	}
	public static void sortByZIP()
	{
		
	}
	public static void createNew()
	{
		
	}
	public static void open()
	{
		
	}
	public static void save()
	{
		
	}
	public static void saveAs()
	{
		
	}
	public static void print()
	{
		System.out.println("person details are: "+fname+ lname+ address+ city+ state+ zipcode+ phno );
	}
	public static void quit()
	{
		
	}
	
}
