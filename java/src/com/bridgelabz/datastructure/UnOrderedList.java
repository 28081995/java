package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgelabz.utility.Utility;

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
		
		Utility u=new Utility();
		System.out.print("Enter a word to search: ");
		String search = u.inputString();	//	word to be searched
		int pos;	//	position of the word in the file
		
		if((pos = ll.index(search)) == -1) {	//	not in the file
			System.out.println("This word is not in the file. Adding it to the list.");
			ll.add(search);
		}
		else {	//	word found
			System.out.println("Word is at " + pos + ". Removing it from list.");
			ll.remove(search);
		}
		try {	//	writes list to the file
			int size = ll.size();
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/Sid/UnorderedListFile.txt");
			for(int i = 0; i < size; i++) {
				String st = ll.pop(i);
				printWriter.write(st + " ");
			}
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
}
	}
}
