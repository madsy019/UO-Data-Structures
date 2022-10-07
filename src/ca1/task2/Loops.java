package ca1.task2;
import java.util.*;
public class Loops {
	
	public Loops() {
		
	}
	
	
	public void printWords(int numberOfTimes) {
		
		String word ="happy";
		
		for (int i =0; i<numberOfTimes;i++ ) {
			System.out.println(word);
		}
	}
		
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int value = 5;
		
		Loops loop = new Loops();
		
		loop.printWords(value);
		
	}
	
	
}
