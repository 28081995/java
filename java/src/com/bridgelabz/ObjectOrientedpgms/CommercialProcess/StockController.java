package com.bridgelabz.ObjectOrientedpgms.CommercialProcess;

import java.io.File;

import com.bridgelabz.utility.Utility;

public class StockController {
	
	public static void main(String[] args) {
		operation();
	}
public static void operation()
{
	Utility u=new Utility();
	StockAccount stacc=new StockAccount();
	
	System.out.println("enter name of the customer");
	String name=u.inputString();
	System.out.println("enter filename");
	String filename=u.inputString();
	File filepath=new File("/home/bridgelabz/aruna1/programs/java/src/com/bridgelabz/ObjectOrientedpgms/CommercialProcess"+filename);
	stacc.CreateNewFile(filepath);
	System.out.println("enter what you want to do");
	System.out.println("press"+"\n"+"1. buy"+"2. sell"+"\n"+"3. save"+"\n"+"4.quit");
	int choice=u.inputInteger();
	switch(choice)
	{
	case 1:System.out.println("if you wish to buy");
	System.out.println("enter amount you have");
	Double buyamount=u.inputDouble();
	System.out.println("enter symbol ");
	String symbol=u.inputString();
    stacc.buy(buyamount,symbol);
    operation();
    break;
	case 2:System.out.println("if you wish to sell");
	System.out.println("at what price you want to sell");
	Double sellamount=u.inputDouble();
	System.out.println("enter symbol");
	String symbol1=u.inputString();
	stacc.sell(sellamount,symbol1);
	operation();
	break;
	case 3:stacc.save();
	break;
	case 4:stacc.quit();
	break;
	default:break;
	}
}
}
