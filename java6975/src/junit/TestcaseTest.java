package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestcaseTest {

	@Test
	public void test() {
		
		
		Testcase obj = new Testcase();
		
		int actualResult = obj.add(10, 20);
		
		/*
		 * int score[] = {1,2,3,4,5}; 
		 * int marks[] = {1,2,3,4,5};
		 * 
		 * assertArrayEquals(score,marks);
		 */
		
		
		//assertFalse(actualResult==7);
		
		//assertEquals(30,actualResult);
		
		/*
		 * String name = null; String name2 = "h";
		 * 
		 * assertNotSame(name,name2);
		 * 
		 * assertNull(name);
		 */
		
		
		
		
		
		
		
		System.out.println("Add class : "+actualResult);
	}

}
