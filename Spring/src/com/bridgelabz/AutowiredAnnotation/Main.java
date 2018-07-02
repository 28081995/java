package com.bridgelabz.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgelabz
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiredannotation.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();
	}
}
