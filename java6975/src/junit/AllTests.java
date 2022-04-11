package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestcaseTest.class, Testsub.class, TestMul.class, TestDiv.class  })
public class AllTests {

}
