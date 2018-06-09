package com.bridgelabz.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.serviceImplementation.ManagerServiceImplementation;

public class CliniqueManager {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		 ManagerServiceImplementation managerimpl=new  ManagerServiceImplementation();
		 managerimpl.addDoctor();
	}

}
