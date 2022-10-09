package ca1.task2;

public class Loops {
	
	//empty constructor for Loops class
	public Loops() {
		
	}
	
	/**
	 * Method to print out a word when a value is give to how many times to loop 
	 * @param int numberOfTimes which tells the number of times that the loop should run
	 * @return	None. 
	 */
	public void printWords(int numberOfTimes) {
		//contains string word to print   
		String word ="Helloworld";
		
		//for loop to print the word
		for (int i =0; i<numberOfTimes;i++ ) {
			System.out.println(word);
		}
	}
		
	public static void main(String[] args) {
		
		// assign the number used to loop.
		int value = 5;
		
		//create object of Loop class
		Loops loop = new Loops();
		//call function printWord on the function on the loop object
		loop.printWords(value);
		
	}
	
	
}
