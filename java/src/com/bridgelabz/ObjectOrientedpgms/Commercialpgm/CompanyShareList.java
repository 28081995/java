package com.bridgelabz.ObjectOrientedpgms.Commercialpgm;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.datastructure.MyLinkedList;
import com.bridgelabz.utility.Utility;

public class CompanyShareList {
	static MyLinkedList<CompanyShares> list=new MyLinkedList<CompanyShares>();
	static Utility u=new Utility();
public static void main(String[] args) {
	CompanyShareList clist=new CompanyShareList();
	clist.start();
}
public void start()
{
	System.out.print("Type 'add' to add the stock and 'remove' to remove the stock: ");
	String move = u.inputString();
	
	if(move.equals("add")) {
		add();
		start();
	}
	else if(move.equals("remove")) {
		remove();
		start();
	}
	else {
		print();
		return;
}
}
public static void add()
{
	String datetime=new SimpleDateFormat("dd/MM/YYYY").format(new Date());
	System.out.println("enter name of symbol");
	String symbol=u.inputString();
	System.out.println("enter no of shares");
	int noofshares=u.inputInteger();
	System.out.println("enter price");
	double price=u.inputDouble();
	CompanyShares stock = new CompanyShares(symbol, noofshares, price, datetime);
	list.add(stock);
}
public static void remove()
{
	System.out.print("Enter stock symbol: ");
	String symbol = u.inputString();
	for(int i = 0; i < list.size(); i++) {
		CompanyShares shareObject;
		if(symbol.equals((shareObject = list.get(i)).getSymbol())) {
			list.remove(shareObject);
			System.out.println("\nRemoved Succesfully...");
			print();
			break;
}
	}
}
public static void print()
{
	for(int i=0;i<list.size();i++)
	{
		System.out.println("printsymbol" +"\t"+ "noofshares" +"\t"+ "date of transaction");
		CompanyShares shareobj=list.get(i);
		System.out.println(shareobj.getSymbol()+"\t"+shareobj.getNoofshare()+"\t"+shareobj.getDateOfTransaction());
	}
}

}
