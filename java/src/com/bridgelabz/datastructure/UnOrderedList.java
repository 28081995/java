package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UnOrderedList {
	public static void main(String[] args) throws IOException {

		String fileName = "/home/bridgelabz/aruna1/programs/java/newtemp.txt";

		FileReader fileReader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fileReader);
		String file;
		LinkedList ll = new LinkedList();

		try {
			while ((file = br.readLine()) != null) {

				String[] words = file.split(" ");
				for (int i = 0; i < words.length; i++) {
					ll.add(words[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		ll.print();
		boolean found = ll.search();
		if (found)
			System.out.println("serching text found");
		else
			System.out.println("text not found");
	}

}
