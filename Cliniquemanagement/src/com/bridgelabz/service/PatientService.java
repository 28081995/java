package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

/**
 * @author bridgelabz
 *
 */
public interface PatientService {

	public void showPatientDetails();

	public void searchPatientById() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void searchPatientByName() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void searchPatientByMobileNo()
			throws JsonGenerationException, JsonMappingException, IOException, ParseException;

}
