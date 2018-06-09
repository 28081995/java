package com.bridgelabz.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Doctor {
	private String doctorName;
	private int doctorId;
	private String doctorSpecialisation;
	private String doctorAvailability;
	private int patientCount;
	
	public Doctor(String doctorName, int doctorId, String doctorSpecialisation, String doctorAvailability,
			int patientCount) {
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.doctorSpecialisation = doctorSpecialisation;
		this.doctorAvailability = doctorAvailability;
		this.patientCount = patientCount;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorSpecialisation() {
		return doctorSpecialisation;
	}
	public void setDoctorSpecialisation(String doctorSpecialisation) {
		this.doctorSpecialisation = doctorSpecialisation;
	}
	public String getDoctorAvailability() {
		return doctorAvailability;
	}
	public void setDoctorAvailability(String doctorAvailability) {
		this.doctorAvailability = doctorAvailability;
	}
	public int getPatientCount() {
		return patientCount;
	}
	public void setPatientCount(int patientCount) {
		this.patientCount = patientCount;
	}
	/*
	//read json and store in arraylist
	public void readJsonAndStore() throws FileNotFoundException, IOException, ParseException
	{
	JSONParser parser = new JSONParser();
	Object ob = parser.parse(new FileReader(filepath));
			
	JSONArray arr=(JSONArray) ob;
	System.out.println(arr);
	ArrayList<JSONObject>arraylist=new ArrayList<JSONObject>();
	for(int i=0;i<arr.size();i++)
	{
		JSONObject jobj=(JSONObject) arr.get(i);
		arraylist.add(jobj);
	}
	
	}
	*/
	
}
