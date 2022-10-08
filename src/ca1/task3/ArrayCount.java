package ca1.task3;

public class ArrayCount {
	
	public ArrayCount(){
		
	}
	
	/**
	 * Return an array that has double the capacity of the method parameter
	 * @param array The array to resize
	 * @return		The resized array. The new array should have double the capacity, and maintain any items in the original. 
	 */
	public int count(String[] array, String target) {
		
		int count =0;
		
		
		for (int i = 0; i<array.length; i++){
			
			
			if (array[i].equals(target)) {
				
				System.out.println("true");
				
				count += 1;
				
				
			}
			else {
				System.out.println("false");
			}
		}
		return count;
		
		
	}
	
	public static void main(String[] args) {
		
		String[] arr = new String[] {"cat", "dog","cat"};
		int occarance = 0;
		ArrayCount array = new ArrayCount();
		
		occarance = array.count(arr, "cat");
		
		System.out.println("Target word = cat" );
		System.out.println("Num of Occurance = " +occarance);
		
	}
	
	
}
