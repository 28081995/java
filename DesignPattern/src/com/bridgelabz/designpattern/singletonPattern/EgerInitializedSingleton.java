package com.bridgelabz.designpattern.singletonPattern;

public class EgerInitializedSingleton {
	private static EgerInitializedSingleton instance = new EgerInitializedSingleton();

	private EgerInitializedSingleton() {
		System.out.println("hiiii");
	}

	public static EgerInitializedSingleton getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		EgerInitializedSingleton.getInstance();
	}
}
