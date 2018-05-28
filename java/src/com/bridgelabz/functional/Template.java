package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Template {
	public static void main(String[] args) {
		Utility u=new Utility();
		System.out.println("enter the user name");
		String st=u.inputString();
		if(st.length()>3)
		{
		String template="hello  <<username>> how are you?";
		template=template.replace("<<username>>",st);
		System.out.println(template);
		}
		else
			System.out.println("string is very small");
	}
}
