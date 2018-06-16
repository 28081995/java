package com.bridgelabz.designpattern.structuralDesignPattern.adapterPattern;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}