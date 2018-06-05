package com.bridgelabz.ObjectOrientedpgms.CommercialDataProcess;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utility.Utility;

public class StockAccount {
String name;
Double balance;
File file;
Utility u=new Utility();

public StockAccount(String filename) throws JsonGenerationException, JsonMappingException, IOException
{
	ObjectMapper objectMapper = new ObjectMapper();
	CompanyShares shares=new CompanyShares();
	objectMapper.writeValue(
			new File("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/CommercialDataProcess/StockAccountFile"), shares);
}

public double valueof()
{
	return balance;
}
public void buy(int amount,String symbol)
{
	
}



}

