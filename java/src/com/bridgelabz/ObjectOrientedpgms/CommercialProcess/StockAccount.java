package com.bridgelabz.ObjectOrientedpgms.CommercialProcess;

import java.io.File;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class StockAccount {
	ArrayList<CompanyShares>list=new ArrayList<CompanyShares>();
	ObjectMapper objectmapper=new ObjectMapper();
	File filepath=new File("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/CommercialProcess/stock.json")
;	
	
	public StockAccount(String filename)
	{
		
	}
	
	public StockAccount() {
		
	}

	public double valueof()
	{
		return 0;
		
	}
	public void buy(Double buyamount,String symbol)
	{
		
	}
	public void sell(Double sellamount,String symbol)
	{
		
	}
    
    public void PrintReport()
    {
    	
    }
	public void CreateNewFile(File filepath) {
		
	}

	public void quit() {
		System.exit(0);
	}

	public void save() {
		
	}
}
