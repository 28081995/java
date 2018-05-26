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
	 static String REGEX_NAME="<.[a-z][0-9]>";


	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the user name");
		String userName=u.inputString();
		
        		 
		Pattern p=Pattern.compile(REGEX_NAME);
		Matcher m=p.matcher(userName);
		m.replaceAll(userName);
		System.out.print("Hello " + userName + ", How are you?");
		m.replaceAll(userName);
	}
}
