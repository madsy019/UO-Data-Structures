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
	 * An empty constructor.
	 */
	public CaesarCypher() {
	
	}
	/**
	 * Return an array that has double the capacity of the method parameter
	 * @param array The array to resizes
	 * @return		The resized array. The new array should have double the capacity, and maintain any items in the original. 
	 */
	public char[] encode(char[] input, int offset) {
		

		for (int i=0; i<input.length; i++) {
			input[i] += offset;
			outputForEncode[i] = input[i];
		}
		return outputForEncode;
	}
	
	public char[] decode(char[] input, int offset) {
		for (int i=0; i<input.length; i++) {
			input[i] -= offset;
			outputForDecode[i] = input[i];
		}
		return outputForDecode;
	}
	
	public static void main(String[] args) {
		
		CaesarCypher cc = new CaesarCypher();
		
		char[] input = {'a', 'b', 'c'};
		char[] input2 = {'c', 'd', 'e'};
		cc.encode(input, 2);
		cc.decode(input2, 2);
		
		
		System.out.print("encript: ");
		for (int i=0; i<outputForEncode.length; i++) {
			System.out.print( outputForEncode[i] +"  " );
		}
		System.out.println(" ");
		System.out.print("decript: ");
		for (int i=0; i<outputForDecode.length; i++) {
			System.out.print( outputForDecode[i] +"  " );
		}
		
		
		
	}
	
}
