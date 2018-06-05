package com.bridgelabz.ObjectOrientedpgms.addressbookpgm;

import com.bridgelabz.utility.Utility;

public class AddressBook extends Person{
	
	private static String fname;
	private static String lname;
	private static String address;
	private static String city;
	private static String state;
	private static int zipcode;
	private static long phno;
	public AddressBook() {
		super(fname, lname, address, city, state, zipcode, phno);
	}
	
	static Utility u=new Utility();
	public void add()
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
	}
	
	public static void edit()
	{
		System.out.println("");
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
		
	}
	public static void quit()
	{
		
	}
	
}
