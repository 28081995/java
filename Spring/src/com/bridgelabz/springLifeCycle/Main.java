package com.bridgelabz.springLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgelabz
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hotel.xml");
		((AbstractApplicationContext) context).registerShutdownHook();// we have to explicitly close
																		// application context otherwise
																		// spring will destroy all beans before end of
																		// main method
		// (registerShutdownhook will destroy explicitly all beans when main method
		// ends)
		Hotel hotel = (Hotel) context.getBean("ho");
		hotel.invite();

	}

}
