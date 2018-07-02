package com.bridgelabz.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgelabz
 *
 */
public class Main {
	public static void main(String a[]) {
		String confFile = "qualifierannotation.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		Payment payment = (Payment) context.getBean("payment");
		System.out.println(payment.toString());
	}
}