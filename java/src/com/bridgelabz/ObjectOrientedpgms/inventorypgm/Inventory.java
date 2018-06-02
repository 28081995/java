package com.bridgelabz.ObjectOrientedpgms.inventorypgm;

import java.util.ArrayList;

/**
 * @author bridgelabz
 *
 */
public class Inventory {
	private ArrayList<Product> ricelist = new ArrayList<Product>();
	private ArrayList<Product> wheatlist = new ArrayList<Product>();
	private ArrayList<Product> pulselist = new ArrayList<Product>();
	public ArrayList<Product> getRicelist() {
		return ricelist;
	}
	public void setRicelist(ArrayList<Product> ricelist) {
		this.ricelist = ricelist;
	}
	public ArrayList<Product> getWheatlist() {
		return wheatlist;
	}
	public void setWheatlist(ArrayList<Product> wheatlist) {
		this.wheatlist = wheatlist;
	}
	public ArrayList<Product> getPulselist() {
		return pulselist;
	}
	public void setPulselist(ArrayList<Product> pulselist) {
		this.pulselist = pulselist;
	}

	

}
