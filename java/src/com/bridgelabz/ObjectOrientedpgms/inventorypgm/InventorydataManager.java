package com.bridgelabz.ObjectOrientedpgms.inventorypgm;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class InventorydataManager {
	static int sumrice = 0, totalrice = 0, sumwheat = 0, totalwheat = 0, sumpulse = 0, totalpulse = 0;
	static Utility u = new Utility();

	public static void main(String[] args) throws IOException, ParseException {
		Inventory inventory = new Inventory();
		ObjectMapper objectMapper = new ObjectMapper();

		System.out.println("enter how many type of rice ");
		int riceTypes = u.inputInteger();
		Product product = new Product();

		for (int i = 0; i < riceTypes; i++) {
			product = productmethod();
			inventory.getRicelist().add(product);
		}
		System.out.println("enter how many type of wheat ");
		int wheatTypes = u.inputInteger();
		for (int i = 0; i < wheatTypes; i++) {
			product = productmethod();
			inventory.getWheatlist().add(product);
		}
		System.out.println("enter how many type of pulse ");
		int pulseTypes = u.inputInteger();
		for (int i = 0; i < pulseTypes; i++) {
			product = productmethod();
			inventory.getPulselist().add(product);

		}

		objectMapper.writeValue(
				new File("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/invent.json"),
				inventory);
		JSONParser parser = new JSONParser();
		Object ob = parser.parse(new FileReader(
				"/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/invent.json"));
		JSONObject jsonObject = (JSONObject) ob;

		JSONArray arr = (JSONArray) jsonObject.get("ricelist");
		JSONArray arr1 = (JSONArray) jsonObject.get("wheatlist");
		JSONArray arr2 = (JSONArray) jsonObject.get("pulselist");
		// to find total rice
		for (int i = 0; i < arr.size(); i++) {

			JSONObject obj = (JSONObject) arr.get(i);
			sumrice += (double) obj.get("weight") * (double) obj.get("price");
			totalrice += (double) obj.get("weight");

		}
		System.out.println(sumrice);
		System.out.println(totalrice);
		// to find total wheat
		for (int i = 0; i < arr1.size(); i++) {

			JSONObject obj = (JSONObject) arr1.get(i);
			sumwheat += (double) obj.get("weight") * (double) obj.get("price");
			totalwheat += (double) obj.get("weight");

		}
		System.out.println(sumwheat);
		System.out.println(totalwheat);
		// to find total pulse
		for (int i = 0; i < arr2.size(); i++) {

			JSONObject obj = (JSONObject) arr2.get(i);
			sumpulse += (double) obj.get("weight") * (double) obj.get("price");
			totalpulse += (double) obj.get("weight");

		}
		System.out.println(sumpulse);
		System.out.println(totalpulse);

		jsonObject.get(inventory.getRicelist());

	}

	public static Product productmethod() {
		Product product = new Product();
		System.out.println("enter the name of product");
		String name = u.inputString();
		product.setName(name);
		System.out.println("enter the weight of product");
		Double weight = u.inputDouble();
		product.setWeight(weight);
		System.out.println("enter the price of product");
		Double price = u.inputDouble();
		product.setPrice(price);
		return product;

	}
}
