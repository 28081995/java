package com.bridgelabz.ObjectOrientedpgms.CommercialProcess;

public class CompanyShares {
	private String symbol;
	private int noofshare;
	private double price;
	private String dateOfTransaction;
	public CompanyShares(String symbol, int noofshare, double price, String dateOfTransaction) {
		this.symbol = symbol;
		this.noofshare = noofshare;
		this.price = price;
		this.dateOfTransaction = dateOfTransaction;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNoofshare() {
		return noofshare;
	}
	public void setNoofshare(int noofshare) {
		this.noofshare = noofshare;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(String dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	

}
