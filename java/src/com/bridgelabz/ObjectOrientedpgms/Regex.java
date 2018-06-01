package com.bridgelabz.ObjectOrientedpgms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

public class Regex {
	static String name="<<name>>";
	static String fname="<<fullname>>";
	static String phno="xxxxxxxxxx";
	static String rdate="01/01/2016";
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the user name");
		String uname=u.inputString();
		System.out.println("enter the user fullname");
		String fullName=u.inputString();
		System.out.println("enter the phone no");
		String phoneno=u.inputString();
		
		DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
		Date datenew=new Date();
		String date=dateFormat.format(datenew);
		
		String template="Hello <<name>>,We have your full name as <<fullname>> in our system."
				+ "your contact numbers 91­xxxxxxxxxx. "
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		
		Pattern p=Pattern.compile(name);
		Matcher m=p.matcher(template);
		template=m.replaceAll(uname);
		Pattern p1=Pattern.compile(fname);
		Matcher m1=p1.matcher(template);
		template=m1.replaceAll(fullName);
		Pattern p2=Pattern.compile(phno);
		Matcher m2=p2.matcher(template);
		template=m2.replaceAll(phoneno);
		Pattern p3=Pattern.compile(rdate);
		Matcher m3=p3.matcher(template);
		template=m3.replaceAll(date);
		System.out.println(template);
		
	
	}

}
