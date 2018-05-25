package com.bridgelabz.functional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Replacestring {
	 String name;
	 String email;
	 static String REGEX_NAME="<name>";
	 String REGEX_EMAIL="<email>";
	
	public String getName() {
		return name;
	}

	public static void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getREGEX_NAME() {
		return REGEX_NAME;
	}

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the user name");
		setName(u.inputString());
		System.out.println("enter the user email");
		String useremail = u.inputString();
		//System.out.print("Hello " + username + ", How are you?");
        		 
		Pattern p=Pattern.compile(REGEX_NAME);
		boolean m=Pattern.matches(REGEX_NAME,getName());
		boolean m1=Pattern.matches(REGEX_EMAIL,getEmail());
	
		
		
		
	}
}
