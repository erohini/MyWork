package sampleJUnitProj;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArithematicTest.class, SampleTest.class })
public class SampleTestSuite {

}
