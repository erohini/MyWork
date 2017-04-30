package sampleJUnitProj;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
		System.out.println("Initialize Resources...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
		System.out.println("Release Resources...");
	}
		

	//will take more than 1000ms to execute... so error occurs
	@Test(timeout=1000)
	public void test() {
		System.out.println("test Method()");
		for(;;){
			
		}
	}

}
