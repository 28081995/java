package com.bridgelabz.serviceImplementation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.Utility;

public class ManagerServiceImplementation implements ManagerService{
	static String doctorName;
	static int doctorId;
	static String doctorSpecialisation;
	static String doctorAvailability;
	static Utility u=new Utility();
	static ArrayList<Doctor> list = new ArrayList<Doctor>();
	static ObjectMapper objectmapper;
	static File filepath=new File("/home/bridgelabz/aruna1/programs/Cliniquemanagement/src/com/bridgelabz/files/Doctor.json");
	Doctor doctor;
	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException 
	{
		System.out.println("enter doctor details");
		System.out.println("enter how many doctors are there?");
		int noOfDoctors=u.inputInteger();
		for(int i=0;i<noOfDoctors;i++)
		{
			System.out.println("enter name of the doctor");
			String doctorName=u.inputString();
			System.out.println("enter id");
			int doctorId=u.inputInteger();
			System.out.println("enter doctor specialization");
			String doctorSpecialisation=u.inputString();
			System.out.println("enter doctor availability");
			String doctorAvailability=u.inputString();
			System.out.println("enter patient count");
			int patientCount=u.inputInteger();
			
            doctor=new Doctor(doctorName,doctorId,doctorSpecialisation,doctorAvailability,patientCount);
			JSONObject jobj = toJSONobject(doctor);
			System.out.println(jobj);
			list.add(doctor);
			writebook(jobj);
		}
	}
	public static JSONObject toJSONobject(Doctor doctor) {
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("doctorName", doctor.getDoctorName());
		jsonobject.put("doctorId", doctor.getDoctorId());
		jsonobject.put("doctorSpecialisation", doctor.getDoctorSpecialisation());
		jsonobject.put("doctorAvailability", doctor.getDoctorAvailability());
		jsonobject.put("patientCount", doctor.getPatientCount());

		return jsonobject;
	}
	public static void writebook(JSONObject jobj) throws JsonGenerationException, JsonMappingException, IOException {

		objectmapper = new ObjectMapper();
		objectmapper.writeValue(filepath, list);
	}


	@Override
	public void deleteDoctor() {
		
	}

	@Override
	public void updateDoctor() {
		
	}

	@Override
	public void addPatient() {
		
	}

	@Override
	public void deletePatient() {
		
	}

	@Override
	public void updatePatient() {
		
	}

}
