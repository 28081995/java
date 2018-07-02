package com.bridgelabz.autowiring;

/**
 * @author bridgelabz
 *
 */
public class Person {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("person's name=" + getName() + "person's AGE=" + getAge());
	}
}
