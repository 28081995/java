package com.bridgelabz.serviceImplementation;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.controller.CliniqueManager;
import com.bridgelabz.service.PatientService;
import com.bridgelabz.utility.Utility;

public class PatientServiceImplementation implements PatientService
{
	Utility u=new Utility();
	static int index1;
	public void showPatientDetails()
	{
		
	}

	@Override
	public void searchPatientById() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter the id of patient you want to search");
		int id=u.inputInteger();
		for (int i = 0; i < ManagerServiceImplementation.list1.size(); i++) {
			if (id==(ManagerServiceImplementation.list1.get(i).getPatientId())) {
				System.out.println("patient found and is at position " + i);
				index1 = i;
			}
		}
		CliniqueManager.option();
	}

	@Override
	public void searchPatientByName() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter the name of patient you want to search");
		String sname=u.inputString();
		for (int i = 0; i < ManagerServiceImplementation.list1.size(); i++) {
			if (sname.equals(ManagerServiceImplementation.list1.get(i).getPatientName())) {
				System.out.println("patient found and is at position " + i);
				index1 = i;
			}
		}
		CliniqueManager.option();
	}
	
	@Override
	public void searchPatientByMobileNo() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("enter the mobileno of patient you want to search");
		long mobileno=u.inputInteger();
		for (int i = 0; i < ManagerServiceImplementation.list1.size(); i++) {
			if (mobileno==(ManagerServiceImplementation.list1.get(i).getPatientMobileNo())) {
				System.out.println("patient found and is at position " + i);
				index1 = i;
			}
		}
		CliniqueManager.option();
	}

}
