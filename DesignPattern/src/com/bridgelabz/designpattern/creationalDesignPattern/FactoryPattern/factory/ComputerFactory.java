package com.bridgelabz.designpattern.creationalDesignPattern.FactoryPattern.factory;

import com.bridgelabz.designpattern.creationalDesignPattern.FactoryPattern.factorymodel.Server;
import com.bridgelabz.designpattern.creationalDesignPattern.FactoryPattern.factorymodel.Computer;
import com.bridgelabz.designpattern.creationalDesignPattern.FactoryPattern.factorymodel.Pc;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new Pc(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}
