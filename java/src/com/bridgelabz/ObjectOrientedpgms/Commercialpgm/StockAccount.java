package com.bridgelabz.ObjectOrientedpgms.Commercialpgm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.utility.Utility;

public class StockAccount {
	String name;
	static double cash;
	static int count;
	static double total;
	static CompanyShares[] companyshares;
	Utility u = new Utility();
	String filename;

	public StockAccount(String filename) throws IOException {
		getFiledata();
	}

	void addOrRemoveStock() {
		System.out.print("Type 'buy' to buy stock or type 'sell' to sell stock: ");
		String action = u.inputString();
		if (action.equals("buy")) {
			System.out.print("Enter amount, symbol, price of the stock: ");
			int amount = u.inputInteger();
			String symbol = u.inputString();
			int price = u.inputInteger();
			buy(amount, symbol, price);
			addOrRemoveStock();
		} else if (action.equals("sell")) {
			System.out.print("Enter amount, symbol, price of the stock: ");
			int amount = u.inputInteger();
			String symbol = u.inputString();
			int price = u.inputInteger();
			sell(amount, symbol, price);
			addOrRemoveStock();
		} else {
			printReport();
			System.out.println("\nTotal stock value: " + valueof());
			writeToFile();
		}
	}

	public  void getFiledata() throws IOException {
		FileReader reader = new FileReader(
				"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/Commercialpgm/stockaccountfile");
		BufferedReader br = new BufferedReader(reader);
		String name = br.readLine();
		double cash = br.read();
		int count = br.read();
		CompanyShares[] companyshares = new CompanyShares[10];
		for (int i = 0; i < count; i++) {
			String line = br.readLine();
			String[] lines = line.split(" ");
			String symbol = lines[0];
			int noofshare = Integer.parseInt(lines[1]);
			double price = Double.parseDouble(lines[2]);
			String datetime = lines[3];
			companyshares[i] = new CompanyShares(symbol, noofshare, price, datetime);
		}
	}

	public static double valueof() {
		total = cash;
		for (int i = 0; i < count; i++) {
			total += companyshares[i].getPrice();
		}
		return total;
	}

	public void printReport() {
		System.out.println("\n" + name + "\n");
		System.out.println("Symbol\tNo. of Shares\tPrice\tValue\tDate");
		for (int i = 0; i < count; i++) {
			CompanyShares shares = companyshares[i];
			System.out.println(shares.getSymbol() + "\t" + shares.getNoofshare() + "\t\t" + shares.getPrice() + "\t"
					+ shares.getDateOfTransaction());
		}
	}

	public void buy(int amount, String symbol, int price) {
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		CompanyShares companyShareObject = new CompanyShares(symbol, amount / price, price, dateTime);
		companyshares[count] = companyShareObject;
		count++;
	}

	public void sell(int amount, String symbol, int price) {
		int numberOfShares = amount / price;
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		for (int i = 0; i < count; i++) {
			if (companyshares[i].getSymbol().equals(symbol)) {
				companyshares[i].setNoofshare(companyshares[i].getNoofshare() - numberOfShares);
				companyshares[i].setDateOfTransaction(dateTime);
				break;
			}
		}
	}

	void save(String filename) throws FileNotFoundException {
		String temp=companyshares.toString();
		PrintWriter pw=new PrintWriter(new FileOutputStream(filename));
		pw.write(temp);
		pw.close();

	}

	void writeToFile() {
		try {
			PrintWriter writer = new PrintWriter("/home/bridgeit/Sid/stockaccount.txt");
			writer.write(name + "\n" + cash + "\n" + count + "\n");
			for (int i = 0; i < count; i++) {
				CompanyShares share = companyshares[i];
				writer.write(share.getSymbol() + " " + share.getNoofshare() + " " + share.getPrice() + " "
						+ share.getDateOfTransaction() + "\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		StockAccount staccount = new StockAccount("hii");
		staccount.addOrRemoveStock();

	}

}
