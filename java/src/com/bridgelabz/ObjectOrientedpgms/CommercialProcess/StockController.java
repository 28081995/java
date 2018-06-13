package com.bridgelabz.ObjectOrientedpgms.CommercialProcess;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class StockController {

	static StockAccount stacc = new StockAccount();

	// main method
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		operation();
	}

	public static void operation() throws FileNotFoundException, IOException, ParseException {
		Utility u = new Utility();

		System.out.println("enter name of the customer");
		String name = u.inputString();
		String filename = u.inputString();
		String path = ("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/CommercialProcess/stock.json"
				+ filename);
		stacc.CreateNewFile(path);
		System.out.println("enter what you want to do");
		System.out.println("press" + "\n" + "1. buy" + "\n" + "2. sell" + "\n" + "3. quit");
		int choice = u.inputInteger();
		String filepath = "/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/CommercialProcess/stock.json";
		switch (choice) {
		case 1:
			System.out.println("if you wish to buy");
			System.out.println("enter amount you have");
			int buyamount = u.inputInteger();
			System.out.println("enter symbol ");
			String symbol = u.inputString();
			stacc.buy(buyamount, symbol, filepath, path);
			operation();
			break;
		case 2:/*
				 * System.out.println("if you wish to sell");
				 * System.out.println("at what price you want to sell"); int
				 * sellamount=u.inputInteger(); System.out.println("enter symbol"); String
				 * symbol1=u.inputString();
				 */
			stacc.sell(filepath, path);
			operation();
			break;
		case 3:
			stacc.quit();
			break;
		default:
			break;
		}
	}
}
