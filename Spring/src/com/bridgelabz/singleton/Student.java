package com.bridgelabz.singleton;

/**
 * @author bridgelabz
 *
 */
public class Student {
	int id;
	String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("student:" + id + " " + name);
	}

}
