package ca1.task1;

import java.util.Arrays;

public class CaesarCypher {
//	array to hold the characters 
	char[] input = new char[' '];
//	integer variable to store the off set value 
	int offset = 0;
//new char array to store the output value;
	static char[] outputForEncode = new char[' '];
	static char[] outputForDecode = new char[' '];
	
	/**
	 * An empty constructor for class CaesarCypher
	 */
	public CaesarCypher() {
	
	}
	/**
	 * Return an char array that has the encoded message
	 * @param array containing characters, The offset value 
	 * @return		The encoded array. The new array should have the encoded message. 
	 */
	public char[] encode(char[] input, int offset) {
		
//		for loop to go through the array and add the new offset character to new array outputForEncode
		for (int i=0; i<input.length; i++) {
			input[i] += offset;
			outputForEncode[i] = input[i];
		}
		return outputForEncode;
	}
	
	/**
	 * Return an char array that has the decoded message
	 * @param array containing characters, The offset value 
	 * @return		The decoded array. The new array should have the decoded message. 
	 */
	public char[] decode(char[] input, int offset) {
		
//		for loop to go through the array and add the new offset character to new array outputForDecode
		for (int i=0; i<input.length; i++) {
			input[i] -= offset;
			outputForDecode[i] = input[i];
		}
		return outputForDecode;
	}
	
	public static void main(String[] args) {
		//create object of CaesarCypher
		CaesarCypher cc = new CaesarCypher();
		
		//create demo input arrays to pass into encode and decode function
		char[] input = {'a', 'b', 'c'};
		char[] input2 = {'c', 'd', 'e'};
		
		//call function encode and decode on the object
		cc.encode(input, 2);
		cc.decode(input2, 2);
		
		// print out the encoded characters using for loop
		System.out.print("encript: ");
		for (int i=0; i<outputForEncode.length; i++) {
			System.out.print( outputForEncode[i] +"  " );
		}
		
		// print out the decoded characters using for loop

		System.out.println(" ");
		System.out.print("decript: ");
		for (int i=0; i<outputForDecode.length; i++) {
			System.out.print( outputForDecode[i] +"  " );
		}
		
		
		
	}
	
}
