package com.bridgelabz.serviceImplementation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgelabz.controller.CliniqueManager;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.Utility;

public class ManagerServiceImplementation implements ManagerService{
	static String doctorName;
	static int doctorId;
	static String doctorSpecialisation;
	static String doctorAvailability;
	static Utility u=new Utility();
	 static ArrayList<Doctor> list = new ArrayList<Doctor>();
	 static ArrayList<Patient> list1 = new ArrayList<Patient>();
	static ObjectMapper objectmapper;
	static File filepath=new File("/home/bridgelabz/aruna1/programs/Cliniquemanagement/src/com/bridgelabz/files/Doctor.json");
	Doctor doctor;
	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException 
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
		CliniqueManager.option();
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
		objectmapper.writeValue(filepath, list1);
	}
	static int index;
	public static boolean search(String sname)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		for (int i = 0; i < list.size(); i++) {
			if (sname.equals(list.get(i).getDoctorName())) {
				System.out.println("doctor found and is at position " + i);
				index = i;
				return true;
			}
		}
		
		return false;
	}
	public void deleteDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException  {
		System.out.println("enter name of doctor you want to delete");
		String name = u.inputString();
		boolean b = search(name);
		if (b) {
			list.remove(index);
			objectmapper.writeValue(filepath, list);
			System.out.println("doctor deleted");
		}
		CliniqueManager.option();
	}
	
	public void updateDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter name of doctor you want to update");
		String name = u.inputString();
		boolean b = search(name);
		if (b) {
			System.out.println("enter what do you want to update");
			System.out.println(
					" 1.doctorname " + "\n" + " 2.doctorid " + "\n" + " 3.doctorspecialization " + "\n" + " 4.doctoravailability  ");
			int input = u.inputInteger();
			switch (input) {
			case 1:
				System.out.println("enter the new doctorname ");
				String dname = u.inputString();
				list.get(index).setDoctorName(dname);
				objectmapper.writeValue(filepath, list);
				break;
			case 2:
				System.out.println("enter the new doctorid ");
				int did = u.inputInteger();
				list.get(index).setDoctorId(did);
				objectmapper.writeValue(filepath, list);
				break;
			case 3:
				System.out.println("enter the new doctorspecialization ");
				String dspec = u.inputString();
				list.get(index).setDoctorName(dspec);
				objectmapper.writeValue(filepath, list);
				break;
			
			}
	}
		CliniqueManager.option();
	}

	@Override
	public void addPatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter patient details");
		System.out.println("enter how many patients are there?");
		int noOfPatients=u.inputInteger();
		for(int i=0;i<noOfPatients;i++)
		{
			System.out.println("enter name of the patient");
			String patientName=u.inputString();
			System.out.println("enter id");
			int patientId=u.inputInteger();
			System.out.println("enter patient age");
			int patientage=u.inputInteger();
			System.out.println("enter patient mobileno");
			long patientmobileno=u.inputInteger();
			Patient patient=new Patient(patientName,patientId,patientage,patientmobileno);
			JSONObject jobj = toJSONobject(patient);
			System.out.println(jobj);
			list1.add(patient);
			writebook(jobj);
		}
		CliniqueManager.option();
	}
	public static JSONObject toJSONobject(Patient patient) {
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("patientName", patient.getPatientName());
		jsonobject.put("patientId", patient.getPatientId());
		jsonobject.put("patientAge", patient.getPatientAge());
		jsonobject.put("patientMobileNo", patient.getPatientMobileNo());
		
		return jsonobject;
	}
	
	
	@Override
	public void deletePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter name of patient you want to delete");
		String name = u.inputString();
		boolean b = search(name);
		if (b) {
			list1.remove(index);
			objectmapper.writeValue(filepath, list1);
			System.out.println("patient deleted");
		}
		CliniqueManager.option();
	}
	static int index1;
	public static boolean search1(String sname)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		for (int i = 0; i < list1.size(); i++) {
			if (sname.equals(list1.get(i).getPatientName())) {
				System.out.println("patient found and is at position " + i);
				index = i;
				return true;
			}
		}
		return false;
	}
	@Override
	public void updatePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter name of patient you want to update");
		String namep = u.inputString();
		boolean b = search(namep);
		if (b) {
			System.out.println("enter what do you want to update");
			System.out.println(
					" 1.patientname " + "\n" + " 2.patientid " + "\n" + " 3.patientage " + "\n" + " 4.patientmobileno ");
			int input = u.inputInteger();
			switch (input) {
			case 1:
				System.out.println("enter the new patientname");
				String pname = u.inputString();
				list.get(index).setDoctorName(pname);
				objectmapper.writeValue(filepath, list);
				break;
			case 2:
				System.out.println("enter the new patientid ");
				int pid = u.inputInteger();
				list.get(index).setDoctorId(pid);
				objectmapper.writeValue(filepath, list);
				break;
			case 3:
				System.out.println("enter the new patientage ");
				int page = u.inputInteger();
				list.get(index).setDoctorId(page);
				objectmapper.writeValue(filepath, list);
				break;
			case 4:
				System.out.println("enter the new patientmobileno ");
				int pmobile = u.inputInteger();
				list.get(index).setDoctorId(pmobile);
				objectmapper.writeValue(filepath, list);
				break;
	}
		}
		CliniqueManager.option();
	}
	public void quit() {
		System.exit(0);
	}
	
	

}
