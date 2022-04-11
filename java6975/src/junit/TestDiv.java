package junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDiv {

	@BeforeClass
	public static void beforeClassmthd(){
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClassmthd() {
		System.out.println("After Class");
	}

	@Test
	public void test() {
Testcase obj3 = new Testcase();
		
		int actualResult = obj3.div(100, 20);
		assertEquals(5,actualResult);
		System.out.println("Division class : "+actualResult);
	}

}
