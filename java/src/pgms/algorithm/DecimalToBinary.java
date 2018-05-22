package pgms.algorithm;

import com.Utility;

/**
 * @author 28081995
 *
 */
public class DecimalToBinary {
	public static void main(String[] args) {
		Utility u=new Utility();
		System.out.println("enter the decimal number");
		int dec=u.inputInteger();             //take decimal input
		//Utility.tobinary(dec);
		toBinary(dec);
	}	
	public static String toBinary(int number) {
		if(number == 1) {
			return String.valueOf(number);
		}
		int remainder = number % 2;
		return toBinary(number / 2) + String.valueOf(remainder);
	}
	
	/** Converts binary number to decimal. **/
	public int binaryToInteger(int binary) {
		String binaryString = String.valueOf(binary);
		int number = 0;
		for (int index = 0; index < binaryString.length(); index++) {
			int tempDigit = binaryString.charAt(index) - '0';
			number = number * 2 + tempDigit; 
		}
		return number;
	}
	
	/**	Swaps nibbles in the given binary **/
	public int swapNibbles(String binaryString) {
		int size = binaryString.length();
		for(int i = 0; i < 8 - size; i++) {
			binaryString = "0" + binaryString;
		}
		String nibble1 = binaryString.substring(0, 4);
		String nibble2 = binaryString.substring(4);
		return Integer.parseInt(nibble2 + nibble1);
	}
	
	/** Returns true if number is power of two **/
	public boolean isPowerOfTwo(int binary) {
		String binaryString = String.valueOf(binary);
		
		for (int index = 1; index < binaryString.length(); index++) {
			if(binaryString.charAt(index) != '0') {
				return false;
			}
		}
		return true;
	}
	
	/**	Represents number as addition of numbers which arte power of two **/
	public String paddedString(int number) {
		int i = 2;
		String returnString = "";
		String plusCharacter = "";
		while(number > 0) {
			if ((number / i) == 0) {
				if(returnString.length() != 0) {
					plusCharacter = " + ";
				}
				returnString = returnString + plusCharacter + (i/2);
				number -= (i/2);
				i = 2;
			}
			else if(number == 1){
				return returnString + " + 1";
			} else {
				i *= 2;
			}
		}
		return returnString;
}
}
