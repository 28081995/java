package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnOrderedList {
	public static void main(String[] args) {
		String fileName="/home/bridgelabz/aruna1/programs/java/newtemp";
		try {
			FileReader fileReader=new FileReader(fileName);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String[] words= bufferedReader.readLine();
			
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
