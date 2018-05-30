package com.bridgelabz.datastructure;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class HashingFunction {
    static int slots = 10;
    static String filePath = "/home/bridgelabz/aruna1/programs/java/newtemp1.txt";

    public static void main(String[] args) throws IOException {
        Utility u = new Utility();
        Integer[] myList = u.fileWriterIntegers(filePath);

        HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
        LinkedList<Integer>[] List = new LinkedList[slots];

        int Value, SlotNumber;
        for (int i = 0; i < myList.length; i++) {
            Value = myList[i];
            SlotNumber = Value % 11;

            if (List[SlotNumber] == null) {
                List[SlotNumber] = new LinkedList<Integer>();
                map.put(SlotNumber, List[SlotNumber]);
            }
            List[SlotNumber].add(Value);
        }
        System.out.println("Map is:" + map);
        System.out.println("Enter the word to search in the map");
        int number1;
        number1 = u.inputInteger();
            int key = number1 % 11;
            map.remove(key);
            System.out.println("Word removed Successfully");
            // WRITING INTO A FILE
            FileWriter writer = new FileWriter(filePath);
            for (int i = 0; i < map.size(); i++) {
                writer.write(map.get(i) + " ");
                writer.flush();
            }
            writer.close();
            System.out.println("Final Map: " + map);
       
    }
  
}


	
