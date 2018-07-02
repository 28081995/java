package com.bridgelabz.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgelabz
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		Person person = (Person) context.getBean("person");
		person.show();

	}
}
