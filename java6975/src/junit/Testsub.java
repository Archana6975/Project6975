package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testsub {

	@Test
	public void test() {
Testcase obj1 = new Testcase();
		
		int actualResult = obj1.sub(100, 20);
		assertEquals(80,actualResult);
		System.out.println("Sub class : "+actualResult);
	}

}
