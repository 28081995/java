package com.bridgelabz.serviceImplementation;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.controller.CliniqueManager;
import com.bridgelabz.service.DoctorService;
import com.bridgelabz.utility.Utility;

public class DoctorImplementation implements DoctorService {
	static Utility u = new Utility();
	static int index;

	public void showDoctorDetails() {

	}

	@Override
	public void searchDoctorById() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter the id of doctor you want to search");
		int id = u.inputInteger();
		for (int i = 0; i < ManagerServiceImplementation.list.size(); i++) {
			if (id == (ManagerServiceImplementation.list.get(i).getDoctorId())) {
				System.out.println("doctor found and is at position " + i);
				index = i;
			}
		}
		CliniqueManager.option();
	}

	@Override
	public void searchDoctorByName() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter the name of doctor you want to search");
		String sname = u.inputString();
		for (int i = 0; i < ManagerServiceImplementation.list.size(); i++) {
			if (sname.equals(ManagerServiceImplementation.list.get(i).getDoctorName())) {
				System.out.println("doctor found and is at position " + i);
				index = i;
			}
		}
		CliniqueManager.option();
	}

	@Override
	public void searchDoctorBySpecialization()
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter the specialization of doctor you want to search");
		String spec = u.inputString();
		for (int i = 0; i < ManagerServiceImplementation.list.size(); i++) {
			if (spec.equals((ManagerServiceImplementation.list.get(i).getDoctorSpecialisation()))) {
				System.out.println("doctor found and is at position " + i);
				index = i;
			}
		}
		CliniqueManager.option();
	}

	@Override
	public void searchDoctorByAvailability() {
		System.out.println("doctor available" + "AM/PM/both");
		String avail = u.inputString();
		for (int i = 0; i < ManagerServiceImplementation.list.size(); i++) {
			if (avail.equals((ManagerServiceImplementation.list.get(i).getDoctorAvailability()))) {
				System.out.println("doctor found and is at position " + i);
				index = i;
			}
		}
	}
}
