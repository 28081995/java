package com.bridgelabz.springLifeCycle;

/**
 * @author bridgelabz
 *
 */
public class Hotel {
	public void invite() {
		System.out.println("weLcome customer");
	}

	// init method is called immediately after bean being instantiated
	public void init() {
		System.out.println("bean initialized");
	}

	// destroy method executed just before bean is about to destroy the hotel bean
	public void destroy() {
		System.out.println("bean destroyed");
	}
}
