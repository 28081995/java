package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

public interface ManagerService {

	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void deleteDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void updateDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void addPatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void deletePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void updatePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

}
