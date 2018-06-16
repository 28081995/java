package com.bridgelabz.designpattern.creationalDesignPattern.singletonPattern;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {

	}

	public static LazyInitializedSingleton getInastance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		LazyInitializedSingleton.getInastance();
	}
}
