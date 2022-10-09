package ca1.task3;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayCountTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void testcount() {
		ArrayCount array = new ArrayCount();
		String[] arr = new String[] {"cat", "dog","cat"};
		
		int expected = 2;
		
		assertEquals(expected, array.count( arr,"cat" ), "test count is not working as expected");
		
	}
	@Test
	void testtarget() {
		ArrayCount array = new ArrayCount();
		String[] arr = new String[] {"cat", "dog","cat"};
		
		int expected = 0;
		assertEquals(expected, array.count( arr,"bird" ),"Does not contain the target"); 
	}
	
	
}
