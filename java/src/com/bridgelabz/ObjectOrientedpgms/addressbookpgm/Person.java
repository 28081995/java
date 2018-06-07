package com.bridgelabz.ObjectOrientedpgms.addressbookpgm;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class Person {
	private String fname;
	private String lname;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private long phno;

	public Person(String fname, String lname, String address, String city, String state, int zipcode, long phno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phno = phno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	public JSONObject tojsonobject() throws JsonGenerationException, JsonMappingException, IOException, ParseException 
	{
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("fname", fname);
		jsonobject.put("lname", lname);
		jsonobject.put("address", address);
		jsonobject.put("city", city);
		jsonobject.put("state", state);
		jsonobject.put("zipcode",zipcode);
		jsonobject.put("phno", phno);
		/*PersonList list=new PersonList();
		ObjectMapper objectmapper=new ObjectMapper();
		objectmapper.writeValue(
				new File("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/addressbookpgm/addressbook.json"),list);
		//JSONParser parser=new JSONParser();
*/		//Object ob = parser.parse(new FileReader("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/addressbookpgm/addressbook.json"));
		//JSONObject jsonObject = (JSONObject) ob;
		return jsonobject;
		
		
	}
	
	

}
