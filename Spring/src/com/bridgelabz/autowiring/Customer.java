package com.bridgelabz.autowiring;

/**
 * @author bridgelabz
 *
 */
public class Customer {
	Person person;

	public Customer(Person person) {
		this.person = person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
