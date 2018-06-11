package com.bridgelabz.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.serviceImplementation.DoctorImplementation;
import com.bridgelabz.serviceImplementation.ManagerServiceImplementation;
import com.bridgelabz.serviceImplementation.PatientServiceImplementation;
import com.bridgelabz.utility.Utility;
public class CliniqueManager {
	static Utility u=new Utility();
	static ManagerServiceImplementation managerimpl;
	static DoctorImplementation doctorimpl;
	static PatientServiceImplementation patientimpl;
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ParseException 
	{
    managerimpl=new  ManagerServiceImplementation();
	option();
	doctorimpl=new DoctorImplementation();
    patientimpl=new PatientServiceImplementation();
	}
		 public static void option() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
				System.out.println("enter which section information you want? "
						+ "type 'd' for doctor and 'p' for patient");
				String st=u.inputString();
				if(st.equals("d"))
				{
				System.out.println("press" + "\n" + "1. adddoctor" + "\n" + "2. deletedoctor " + "\n" + "3. updatedoctor "+ "\n" + "4. searchDoctorByName " + "\n" +"5. searchDoctorById"+ "\n" +"6. searchDoctorBySpecialization"+ "\n" +"7. searchDoctorByAvailability"+"8. quit");
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
				case 4:doctorimpl.searchDoctorByName();
				break;
				case 5:doctorimpl.searchDoctorById();
				break;
				case 6:doctorimpl.searchDoctorBySpecialization();
				break;
				case 7:doctorimpl.searchDoctorByAvailability();
				break;
				case 8:managerimpl.quit();
				break;
				default: break;
				}
				}
				
				else if(st.equals("p"))
				{
					System.out.println("press" + "\n" + "1. addpatient" + "\n" + "2. updatepatient " + "\n" + "3. deletepatient " + "\n"+"4. searchPatientById"+"\n" +"5. searchPatientById"+"\n" +"6. searchPatientByMobileNo"
							 +"7. quit");
					int choice = u.inputInteger();
				
					switch(choice) {
				case 1:
					managerimpl.addPatient();
					break;
				
				case 2:
					managerimpl.updatePatient();
					break;	
					
				case 3:
						managerimpl.deletePatient();
						break;
				case 4:patientimpl.searchPatientById();
				break;
				case 5:patientimpl.searchPatientById();
				break;
				case 6:patientimpl.searchPatientByMobileNo();
				break;
				default: break;
				}
					
					
				}
		
		 }
		

}