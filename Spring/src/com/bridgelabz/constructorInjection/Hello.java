package com.bridgelabz.constructorInjection;

/**
 * @author bridgelabz
 *
 */
public class Hello {
	String msg;
	int value;

	public Hello(String msg, int value) {
		this.msg = msg;
		this.value = value;
	}

	public String getMsg() {
		return msg;
	}

	public int getValue() {
		return value;
	}

	public void display() {
		System.out.println("hello!!!! " + getMsg() + " contact at " + getValue());
	}

}
