package com.bridgelabz.serviceImplementation;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgelabz.controller.CliniqueManager;
import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class ManagerServiceImplementation implements ManagerService {
	static String doctorName;
	static int doctorId;
	static String doctorSpecialisation;
	static String doctorAvailability;
	static String patientName;
	static int patientId;
	static long patientMobileNo;
	static int patientAge;
	static Utility u = new Utility();
	static ArrayList<Doctor> list = new ArrayList<Doctor>();
	static ArrayList<Patient> list1 = new ArrayList<Patient>();
	static ArrayList<Appointment> list2 = new ArrayList<Appointment>();
	static ObjectMapper objectmapper;

	static File filepath = new File(
			"/home/bridgelabz/aruna1/programs/Cliniquemanagement/src/com/bridgelabz/files/Doctor.json");
	static File filepath1 = new File(
			"/home/bridgelabz/aruna1/programs/Cliniquemanagement/src/com/bridgelabz/files/Patient.json");
	static File filepath2 = new File(
			"/home/bridgelabz/aruna1/programs/Cliniquemanagement/src/com/bridgelabz/files/Appointment.json");

	Doctor doctor;
	Patient patient;
	static Appointment ap;

	/* (non-Javadoc)
	 * @see com.bridgelabz.service.ManagerService#addDoctor()
	 */
	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter doctor details");
		System.out.println("enter how many doctors are there?");
		int noOfDoctors = u.inputInteger();
		for (int i = 0; i < noOfDoctors; i++) {
			System.out.println("enter name of the doctor");
			String doctorName = u.inputString();
			System.out.println("enter id");
			int doctorId = u.inputInteger();
			System.out.println("enter doctor specialization");
			String doctorSpecialisation = u.inputString();
			System.out.println("enter doctor availability");
			String doctorAvailability = u.inputString();
			System.out.println("enter patient count");
			int patientCount = u.inputInteger();
			doctor = new Doctor(doctorName, doctorId, doctorSpecialisation, doctorAvailability, patientCount);
			JSONObject jobj = toJSONobject(doctor);
			System.out.println(jobj);
			list.add(doctor);
			writebook(jobj);
		}
		CliniqueManager.option();
	}

	/**
	 * @param doctor
	 * @return
	 */
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

	static int index;

	/**
	 * method to search doctor by name
	 * @param name
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public static boolean search(String name)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getDoctorName())) {
				System.out.println("doctor found and is at position " + i);
				index = i;
				return true;
			}
		}

		return false;
	}

	/* (non-Javadoc)
	 * @see com.bridgelabz.service.ManagerService#deleteDoctor()
	 */
	public void deleteDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
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

	/* (non-Javadoc)
	 * @see com.bridgelabz.service.ManagerService#updateDoctor()
	 */
	public void updateDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter name of doctor you want to update");
		String name = u.inputString();
		boolean b = search(name);
		if (b) {
			System.out.println("enter what do you want to update");
			System.out.println(" 1.doctorname " + "\n" + " 2.doctorid " + "\n" + " 3.doctorspecialization " + "\n"
					+ " 4.doctoravailability  ");
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

	/* (non-Javadoc)
	 * @see com.bridgelabz.service.ManagerService#addPatient()
	 */
	@Override
	public void addPatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter patient details");
		System.out.println("enter how many patients are there?");
		int noOfPatients = u.inputInteger();
		for (int i = 0; i < noOfPatients; i++) {
			System.out.println("enter name of the patient");
			String patientName = u.inputString();
			System.out.println("enter id");
			int patientId = u.inputInteger();
			System.out.println("enter patient age");
			int patientAge = u.inputInteger();
			System.out.println("enter patient mobileno");
			long patientMobileNo = u.inputLong();
			patient = new Patient(patientName, patientId, patientMobileNo, patientAge);
			JSONObject jobj1 = toJSONobject1(patient);
			System.out.println(jobj1);
			list1.add(patient);
			writebook1(jobj1);
		}
		CliniqueManager.option();
	}

	/**
	 * @param patient
	 * @return
	 */
	public static JSONObject toJSONobject1(Patient patient) {
		JSONObject jsonobject1 = new JSONObject();
		jsonobject1.put("patientName", patient.getPatientName());
		jsonobject1.put("patientId", patient.getPatientId());
		jsonobject1.put("patientAge", patient.getPatientAge());
		jsonobject1.put("patientMobileNo", patient.getPatientMobileNo());

		return jsonobject1;
	}

	public static void writebook1(JSONObject jobj1) throws JsonGenerationException, JsonMappingException, IOException {

		objectmapper = new ObjectMapper();
		objectmapper.writeValue(filepath1, list1);
	}

	/* (non-Javadoc)
	 * @see com.bridgelabz.service.ManagerService#deletePatient()
	 */
	@Override
	public void deletePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter name of patient you want to delete");
		String name = u.inputString();
		boolean b = search1(name);
		if (b) {
			list1.remove(index);
			objectmapper.writeValue(filepath, list1);
			System.out.println("patient deleted");
		}
		CliniqueManager.option();
	}

	static int index1;

	/**
	 * method to patient by name
	 * @param sname
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
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

	/* (non-Javadoc)
	 * @see com.bridgelabz.service.ManagerService#updatePatient()
	 */
	@Override
	public void updatePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter name of patient you want to update");
		String namep = u.inputString();
		boolean b = search(namep);
		if (b) {
			System.out.println("enter what do you want to update");
			System.out.println(" 1.patientname " + "\n" + " 2.patientid " + "\n" + " 3.patientage " + "\n"
					+ " 4.patientmobileno ");
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

	int count = 0;
	int patientcount;
	private String timeStamp;

	/**
	 * method to take appointment by doctor
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void takeAppointment() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter patient name");
		String patname = u.inputString();
		System.out.println("enter patient id");
		int patid = u.inputInteger();
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/YYYY");
		Date datenew1 = new Date();
		String timeStamp = dateFormat1.format(datenew1);

		if (search1(patname)) {
			ap.setPatientName(patname);
			ap.setPatientId(patid);
			ap.setTimeStamp(timeStamp);

		}
		System.out.println("enter name of doctor you want to take appoint");
		String docname = u.inputString();
		System.out.println("enter doctor id");
		int docid = u.inputInteger();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		Date datenew = new Date();
		String date = dateFormat.format(datenew);
		if (search(docname)) {
			ap.setDoctorName(docname);
			ap.setDoctorId(docid);
			ap.setTimeStamp(timeStamp);
			System.out.println("appointment is fixed");
		}
		if (patientcount < 5) {
			System.out.println("doctor available for appointment");
		} else
			System.out.println("doctor is not available for appointment");

		ap = new Appointment(docname, docid, patname, patid, timeStamp);
		JSONObject jobj2 = toJSONobject2(ap);
		System.out.println(jobj2);
		list2.add(ap);
		writebook2(jobj2);
	}
	/**
	 * @param appoint
	 * @return
	 */
	public static JSONObject toJSONobject2(Appointment appoint) {
		JSONObject jsonobject2 = new JSONObject();
		jsonobject2.put("doctorName", ap.getDoctorName());
		jsonobject2.put("doctorId", ap.getDoctorId());
		jsonobject2.put("patientName", ap.getPatientName());
		jsonobject2.put("patientId", ap.getPatientId());
		jsonobject2.put("timeStamp", ap.getTimeStamp());

		return jsonobject2;
	}

	public static void writebook2(JSONObject jobj2) throws JsonGenerationException, JsonMappingException, IOException {

		objectmapper = new ObjectMapper();
		objectmapper.writeValue(filepath2, list2);
	}

	public void quit() {
		System.exit(0);
	}
}
