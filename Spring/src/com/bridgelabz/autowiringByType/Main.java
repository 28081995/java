package com.bridgelabz.autowiringByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgelabz
 *
 */
public class Main {
	public static void main(String[] args) {
		String confFile = "autowiringByType.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		Paymentway paymentGateway = (Paymentway) context.getBean("paymentway");
		System.out.println(paymentGateway.toString());
	}
}
