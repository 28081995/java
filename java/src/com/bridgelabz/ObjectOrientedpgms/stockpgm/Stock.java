package com.bridgelabz.ObjectOrientedpgms.stockpgm;

/**
 * @author bridgelabz
 *
 */
public class Stock {
	private String stockName;
	private int noOfShare;
	private double stockPrice;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

}
