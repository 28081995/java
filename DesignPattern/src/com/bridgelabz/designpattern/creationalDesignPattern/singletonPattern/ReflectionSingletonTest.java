package com.bridgelabz.designpattern.creationalDesignPattern.singletonPattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EgerInitializedSingleton instanceOne = EgerInitializedSingleton.getInstance();
		EgerInitializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = EgerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EgerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		// hashcode of both the instances are not same indicates singleton destroyed
	}

}