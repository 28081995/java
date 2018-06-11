package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

public interface DoctorService {
	
public void showDoctorDetails();

public void searchDoctorById() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

public void searchDoctorByName() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

public void searchDoctorBySpecialization() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

public void searchDoctorByAvailability();

}
