package ca1.task4;

public class CarProcessing {
	public static void main(String[] args) {
		
		//object cp of class CarProcessing
		CarProcessing cp = new CarProcessing();
		//array containing list of car objects
		Car[] cars = { 
				new Car("Honda", "Civic", "Red"),
				new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"),
				new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"),
				new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"),
				new Car("Honda", "Civic", "Purple")
		};
		
		//call function remove duplicates
		Car[] noDuplicates = cp.removeDuplicates(cars);
		
		//print out the non duplicate values
		for(Car c : noDuplicates ) {
			System.out.println(c);
		}
		

		
	}
	
	/**
	 * Return a new array of type Car[] containing non duplicate values
	 * @param array of type Car[]
	 * @return	newarry type Car [] with no duplicate values
	 */
	
	public Car[] removeDuplicates(Car[] inputArray) {
		
		
		//create temp array with size 0
		Car temp = inputArray[0];
		
		//variable to keep track of how many unique values there 
		int count = 0;
		
		//for loop to count how many distinct values are there
		for(int i =1;i<inputArray.length;i++) {
			
			if((inputArray[i].equals(temp)) == false) {
				count+=1;
				//add the distinct values to temp array
				temp = inputArray[i];
				
						
			}
	
		}
		//create a new array with size of count to store distinct values
		Car[] newarry = new Car[count];
		
		int index= 0;
		//add all the distinct values to newarry
		for(int i =1;i<inputArray.length;i++) {
			if((inputArray[i].equals(temp)) == false) {
				newarry[index] = inputArray[i];
				index+=1;
			}
		}
		
		return newarry;
	}
	
}
