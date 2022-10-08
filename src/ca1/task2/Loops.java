package ca1.task2;

public class Loops {
	
	public Loops() {
		
	}
	
	
	public void printWords(int numberOfTimes) {
		
		String word ="Helloworld";
		
		for (int i =0; i<numberOfTimes;i++ ) {
			System.out.println(word);
		}
	}
		
	public static void main(String[] args) {
		
		int value = 5;
		
		Loops loop = new Loops();
		
		loop.printWords(value);
		
	}
	
	
}
