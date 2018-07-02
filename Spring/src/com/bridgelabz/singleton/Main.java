package com.bridgelabz.singleton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author bridgelabz
 *
 */
public class Main {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("student.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println(factory.getBean("ss"));
		Student s1 = (Student) factory.getBean("ss");// scope is prototype so its creating different objects
		s1.display(); // default singleton will create only one instance at any time
		System.out.println(factory.getBean("ss"));
		Student s2 = (Student) factory.getBean("ss");
		s2.display();

	}

}
