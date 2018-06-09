package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface ManagerService {

public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException;
public void deleteDoctor();
public void updateDoctor();
public void addPatient();
public void deletePatient();
public void updatePatient();

}
