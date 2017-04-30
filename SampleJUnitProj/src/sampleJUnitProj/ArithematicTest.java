package sampleJUnitProj;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sampleJUnitProj.Arithematic;

@RunWith(Parameterized.class)
public class ArithematicTest {
	
	
	int num1,num2,expectedValue;
	static Arithematic arithematic;
	
	public ArithematicTest(int num1, int num2, int expectedValue) {

		this.num1 = num1;
		this.num2 = num2;
		this.expectedValue = expectedValue;
	}
	
	@BeforeClass
	public static void init(){
		System.out.println("init()");
		 arithematic=new Arithematic();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@Test
	public void testSum() {
		
		int result = arithematic.sum(num1, num2);
		
		assertEquals(expectedValue, result);
	}
	
	@Parameters
	public static Collection<Object[]> getValues() {
		Object[][] values= new Object[][] {{10,20,30},{10,56,66},{50,30,80},{12,35,47}};
		return Arrays.asList(values);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
	}
	
	@AfterClass
	public static void destroy(){
		System.out.println("destroy()");
		arithematic = null;
	}

}
