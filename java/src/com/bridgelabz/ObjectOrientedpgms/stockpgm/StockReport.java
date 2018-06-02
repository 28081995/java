package com.bridgelabz.ObjectOrientedpgms.stockpgm;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class StockReport {
	static Utility u = new Utility();
	static int sumvalue = 0;
	static int totalvalue = 0;

	public static void main(String[] args)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		StockPortfolio folio = new StockPortfolio();

		System.out.println("enter no of stocks");
		int numStocks = u.inputInteger();
		Stock stock = new Stock();
		for (int i = 0; i < numStocks; i++) {
			stock = stockMethod();
			folio.stockList.add(stock);
		}
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File(
				"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/stockpgm/stock.json"),
				folio);
		JSONParser parser = new JSONParser();

		Object ob = parser.parse(new FileReader(
				"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/stockpgm/stock.json"));
		JSONObject jsonObject = (JSONObject) ob;
		JSONArray arr1 = (JSONArray) jsonObject.get("stockList");
		System.out.println(arr1);
		for (int i = 0; i < arr1.size(); i++) {
			JSONObject obj = (JSONObject) arr1.get(i);
			sumvalue += (long) obj.get("noOfShare") * (double) obj.get("stockPrice");
			totalvalue += (long) obj.get("noOfShare");

		}
		System.out.println(sumvalue);
		System.out.println(totalvalue);

	}

	public static Stock stockMethod() {
		Stock stock = new Stock();
		System.out.println("enter the name of stock");
		String name = u.inputString();
		stock.setStockName(name);
		System.out.println("enter no of share");
		int share = u.inputInteger();
		stock.setNoOfShare(share);
		System.out.println("enter stock price");
		double price = u.inputDouble();
		stock.setStockPrice(price);
		return stock;

	}
}
