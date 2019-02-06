package JUnitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ calculateInsurance.class, findProductbyName.class, initCalculation.class })
public class AllTests {

}
