package com.bridgelabz.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.serviceImplementation.DoctorImplementation;
import com.bridgelabz.serviceImplementation.ManagerServiceImplementation;
import com.bridgelabz.serviceImplementation.PatientServiceImplementation;
import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class CliniqueManager {
	static Utility u = new Utility();
	static ManagerServiceImplementation managerimpl;
	static DoctorImplementation doctorimpl;
	static PatientServiceImplementation patientimpl;

	public static void main(String[] args)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		managerimpl = new ManagerServiceImplementation();
		option();

	}

	public static void option() throws JsonGenerationException, JsonMappingException, IOException, ParseException {

		System.out.println("press" + "\n" + "1. adddoctor" + "\n" + "2. deletedoctor " + "\n" + "3. updatedoctor "
				+ "\n" + "4. addpatient " + "\n" + "5. deletepatient" + "\n" + "6. updatepatient" + "\n"
				+ "7. takeappointment" + "8. quit");
		int choice = u.inputInteger();
		switch (choice) {

		case 1:
			managerimpl.addDoctor();
			break;
		case 2:
			managerimpl.deleteDoctor();
			break;
		case 3:
			managerimpl.updateDoctor();
			break;
		case 4:
			managerimpl.addPatient();
			break;
		case 5:
			managerimpl.deletePatient();
			break;
		case 6:
			managerimpl.updatePatient();
			break;
		case 7:
			managerimpl.takeAppointment();
			break;
		default:
			break;

		}

	}
}