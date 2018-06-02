package com.bridgelabz.ObjectOrientedpgms.stockpgm;

import java.util.ArrayList;

/**
 * @author bridgelabz
 *
 */
public class StockPortfolio {
	ArrayList<Stock> stockList = new ArrayList<Stock>();

	public ArrayList<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(ArrayList<Stock> stockList) {
		this.stockList = stockList;
	}

}
