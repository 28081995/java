package com.bridgelabz.designpattern.singletonPattern;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	// it provides thread safety but,reduces performance(to avoid use double
	// checking)
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		ThreadSafeSingleton.getInstance();
	}
}