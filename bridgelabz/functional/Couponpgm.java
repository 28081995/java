package com.bridgelabz.functional;

public class Couponpgm {
	public static void main(String[] args) {
		int n = 11;
		int count = collect(n);
		System.out.println(count);

	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;

		while (distinct < n) {
			int value = getcoupon(n);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

	public static int getcoupon(int n) {
		return (int) (Math.random() * n);

	}
}
