package com.bridgelabz.ObjectOrientedpgms.CommercialProcess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.datastructure.MyQueue;
import com.bridgelabz.datastructure.MyStack;
import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class StockAccount {

	static String name;
	static double balance;
	static File f;
	static Customer customer = new Customer();
	static CompanyShares comshare = new CompanyShares();
	static String customerData;
	static String currentcustomerData;
	static String shareStockData;
	static String currentShareStockData;
	// ***********************************************************************************************
	long numOfSharesAvailable = 30;
	String stockName[] = { "icecream", "chocalate", "biscuits", "chips" };
	int[] shareRate = { 100, 80, 30, 50 };
	static ArrayList<CompanyShares> list = new ArrayList<CompanyShares>();
	static Utility u = new Utility();
	static File filepath = new File(
			"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/CommercialProcess/stock.json");
	static ObjectMapper map = new ObjectMapper();
	MyQueue<String> queue = new MyQueue<String>();
	MyStack<String> stack = new MyStack<String>();

	/**
	 * constructor of stockaccount
	 * @param filename
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public StockAccount(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper map = new ObjectMapper();
		map.writeValue(new File(
				"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/CommercialProcess/stock.json"),
				comshare);
	}

	public StockAccount() {
	}

	public static JSONObject toJSONobject(CompanyShares comshare) {
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("symbol", comshare.getSymbol());
		jsonobject.put("noofshare", comshare.getNoofshare());
		jsonobject.put("price", comshare.getPrice());
		jsonobject.put("dateOfTransaction", comshare.getDateOfTransaction());
		return jsonobject;
	}

	public static JSONArray readFromFile(String filepath) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object ob = parser.parse(new FileReader(filepath));
		JSONArray arr = (JSONArray) ob;
		System.out.println(arr);
		return arr;
	}

	public void WriteintoFile(JSONArray jsonarray, String filepath)
			throws JsonGenerationException, JsonMappingException, IOException {

		map.writeValue(new File(filepath), jsonarray);

	}

	public double valueOf() {
		return balance;
	}

	private CompanyShares shareDetails() {
		CompanyShares shares = new CompanyShares();

		System.out.println("Enter the Stock Symbol");
		String symbol = u.inputString();
		shares.setSymbol(symbol);

		System.out.println("Enter the Number of Stock");
		long noOfShare = u.inputLong();
		shares.setNoofshare((int) noOfShare);

		System.out.println("Enter the price of Stock");
		int sharePrice = u.inputInteger();
		shares.setPrice(sharePrice);

		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/YYYY");
		Date datenew1 = new Date();
		String dateOfTransaction = dateFormat1.format(datenew1);
		shares.setDateOfTransaction(dateOfTransaction);

		return shares;
	}

	/**
	 * method to update account
	 * 
	 * @param filepath
	 * @param symbol
	 * @param buyshares
	 * @param amount
	 * @throws IOException
	 */
	public static void update(String filepath, String symbol, int buyshares, int amount) throws IOException {
		FileWriter filewriter = new FileWriter(filepath);
		BufferedWriter bw = new BufferedWriter(filewriter);
		String data = "share of" + symbol + "\n" + "noofshare" + buyshares + amount;
		bw.write(data);
		bw.flush();
		bw.close();

	}

	/**
	 * method to print
	 * 
	 * @param filepath
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void printEntries(String filepath) throws FileNotFoundException, IOException, ParseException {
		JSONArray array = readFromFile(filepath);
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

	}

	/**
	 * method to sell stock
	 * 
	 * @param filepath
	 * @param newAccountPath
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void sell(String filepath, String newAccountPath) throws FileNotFoundException, IOException, ParseException {
		printEntries(filepath);
		CompanyShares companyshares = shareDetails();
		JSONObject jsonobject = toJSONobject(companyshares);
		stack.push((String) jsonobject.get("symbol"));
		JSONArray jsonarray = readFromFile(filepath);
		System.out.println(jsonarray);
		jsonarray.add(jsonobject);
		WriteintoFile(jsonarray, filepath);
		WriteintoFile(jsonarray, newAccountPath);
		System.out.println("your shares added successfully");
		System.out.println("symbol added to stack");
		stack.display();
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/YYYY");
		Date datenew1 = new Date();
		String date = dateFormat1.format(new Date());
		queue.enqueue(date);
		System.out.println("date added to queue");
		queue.display();
	}

	/**
	 * method to buy stock
	 * 
	 * @param amount
	 * @param symbol
	 * @param filepath
	 * @param newAccountFilePath
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void buy(int amount, String symbol, String filepath, String newAccountFilePath)
			throws FileNotFoundException, IOException, ParseException {
		JSONArray array = readFromFile(filepath);
		System.out.println(array);
		System.out.println("enter how many shares you want");
		int buyshares = u.inputInteger();
		for (int i = 0; i < array.size(); i++) {
			JSONObject temporary = (JSONObject) array.get(i);
			System.out.println(temporary);
			if (symbol.equals(temporary.get("symbol"))) {
				long temp = (long) temporary.get("noofshares") - buyshares;
				temporary.put("noofshares", temp);
				array.remove(i);
				array.add(i, temporary);
				amount = (amount - (buyshares * (int) temporary.get("price")));
				WriteintoFile(array, filepath);
				update(newAccountFilePath, symbol, buyshares, amount);
				stack.push((String) temporary.get("symbol"));
				System.out.println("transaction over ,symbol is pushedto the stack");
				stack.display();
				DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/YYYY");
				Date datenew1 = new Date();
				String date = dateFormat1.format(new Date());
				queue.enqueue(date);
				System.out.println("date added to queue");
				queue.display();
				break;
			}
		}

	}

	/**
	 * method to print stock report
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void printReport() throws FileNotFoundException, IOException, ParseException {
		JSONParser json = new JSONParser();
		Object obj = json.parse(new FileReader(
				"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/CommercialProcess/stock.json"));
		JSONObject jsonObj = (JSONObject) obj;
		JSONArray totalShare = (JSONArray) jsonObj.get("customerArray");
		JSONObject customerDetails = (JSONObject) totalShare.get(0);
		JSONObject companyShareobj = (JSONObject) customerDetails.get("userList");
		JSONArray shareArray = (JSONArray) companyShareobj.get("list");
		for (int i = 0; i < shareArray.size(); i++) {
			JSONObject temp = (JSONObject) shareArray.get(i);
			System.out.println(" " + temp + " ");
		}
	}

	/**
	 * creating new file
	 * 
	 * @param filepath
	 * @throws IOException
	 */
	public void CreateNewFile(String filepath) throws IOException {
		File file = new File(filepath);
		if (file.createNewFile()) {
			System.out.println("new file created");
		} else
			System.out.println("file already exists");
	}

	public void quit() {
		System.exit(0);
	}
}