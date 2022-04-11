package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMul {

	@Test
	public void test() {
Testcase obj2 = new Testcase();
		
		int actualResult = obj2.mul(100, 20);
		assertEquals(2000,actualResult);
		System.out.println("Multiply class : "+actualResult);
	}

}
