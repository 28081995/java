package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class OrderedListQues {

	public static void main(String[] args) {

		// ordered list to store numbers
		OrderedList<Integer> orderedList = new OrderedList<Integer>();

		String[] strings;
		// buffered reader to read from the file
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader("/home/bridgelabz/aruna1/programs/java/newtemp1.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line; // store line from file
			while ((line = bufferedReader.readLine()) != null) {
				line = line.replaceAll("\\.", ""); // removes dots in the file
				strings = line.split(" "); // puts words into the string array

				// converts strings to integers and adds to the list
				for (String integer : strings) {
					orderedList.add(Integer.parseInt(integer));
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		orderedList.list(); // prints the list elements
		Utility u = new Utility();
		System.out.print("Enter a number to search: ");
		int search = u.inputInteger(); // number to be searched in the file

		int pos; // index of the number in the list

		if ((pos = orderedList.index(search)) == -1) { // number is not in the file
			System.out.println("This word is not in the file. Adding it to the list.");
			orderedList.add(search);
		} else { // number is in the file
			System.out.println("Word is at " + pos + ". Removing it from list.");
			orderedList.remove(search);
		}
		try { // writes the new list to the file
			int size = orderedList.size(); // size of the list
			// print writer to write in the file
			PrintWriter printWriter = new PrintWriter("/home/bridgelabz/aruna1/programs/java/newtemp1.txt");
			for (int i = 0; i < size; i++) {
				int integer = orderedList.pop(0);
				printWriter.write(integer + " ");
			}
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}