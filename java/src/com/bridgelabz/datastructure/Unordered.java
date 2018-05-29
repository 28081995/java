package com.bridgelabz.datastructure;

import java.io.*;
import com.bridgelabz.utility.Utility;

public class Unordered<T> {
	public static void main(String[] args) {
		File file = new File("/home/bridgelabz/aruna1/programs/java/newtemp.txt");
		FileReader fr = null;
		MyLinkedList<String> list1 = new MyLinkedList<String>();
		BufferedReader fw = null;
		try {
			fr = new FileReader(file);
			fw = new BufferedReader(fr);
			String searchword = fw.readLine();
			System.out.println(searchword);
			while (searchword != null) {
				String[] str = searchword.split(" ");
				for (int i = 0; i < str.length; i++) {
					list1.add(str[i]);
				}

				String[] str1 = new String[list1.size()];

				list1.dispay();
				Utility u = new Utility();
				System.out.println("enter the elements to be added to the list");
				String ele = u.inputString();
				if (!list1.search(ele)) {
					list1.add(ele);
					list1.dispay();
				}

				else {
					list1.deleteNode(ele);
					list1.dispay();
				}

				PrintWriter fw1 = new PrintWriter("/home/bridgelabz/aruna1/programs/java/newtemp.txt");
				for (int i = 0; i < list1.size(); i++) {
					fw1.print(list1.getvalue(i) + " ");
				}
				fw1.close();

			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}