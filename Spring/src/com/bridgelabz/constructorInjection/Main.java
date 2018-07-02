package com.bridgelabz.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgelabz
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		Hello ref = (Hello) context.getBean("h");
		ref.display();
	}

}
