package com.annotationpgm.BuiltInAnnotation;

class ShopInfo {
	public void shopTime() {
		System.out.println("timing: 8 AM");
	}
}

public class Shop extends ShopInfo {
	@Override // if any change in the superclass method then it will throw error,we can easily
				// findout overrided or not
	public void shopTime() {
		System.out.println("timing: 7 AM");
	}

	@Deprecated // we were using it before but don't want now if you want you can use also
	public void shopHost() {
		System.out.println("old host information not required");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused") // for unused field throws a warning
		String st = "aruna";
		Shop s = new Shop();
		s.shopTime();
	}
}
