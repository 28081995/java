package com.bridgelabz.designpattern.singletonPattern;

public class BillPughSingleton {
	private BillPughSingleton() {

	}

	/**
	 * @author bridgelabz it contains singleton instance inside inner helper class
	 *         not require synchronization
	 */
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public static void main(String[] args) {
		BillPughSingleton.getInstance();
	}
}