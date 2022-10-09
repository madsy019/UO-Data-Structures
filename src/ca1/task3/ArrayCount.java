package ca1.task3;

public class ArrayCount {
	
	public ArrayCount(){
		
	}
	
	/**
	 * Return the count of the target word in the array
	 * @param String[] array = array of strings , String target= target string
	 * @return	count , count of the string value in the array. 
	 */
	public int count(String[] array, String target) {
		
		//variable to hold the count
		int count =0;
		
//		for loop to go through the array 
		for (int i = 0; i<array.length; i++){
			
			//check if the array value at the index is equal to target 
			if (array[i].equals(target)) {
				
				//increase count
				count += 1;
				
				
			}

		}
		//return count
		return count;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		//create string array
		String[] arr = new String[] {"cat", "dog","cat"};
		//variable to store the count value
		int occarance = 0;
		//object of class ArrayCount
		ArrayCount array = new ArrayCount();
		
		//call count method on object
		occarance = array.count(arr, "bird");
		
		
		//Print the occurrence of the target word
		System.out.println("Num of Occurance = " +occarance);
		
	}
	
	
}
