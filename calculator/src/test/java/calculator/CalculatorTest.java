package calculator;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;

import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
		calculator = new Calculator();
	}
	@Test  
	public void testFindMax(){  
		assertEquals(4,calculator.findMax(1,3,4));  
		assertEquals(-1,calculator.findMax(-12,-1,-2));  
	} 
	@Test  
	public void testSquare1(){  
		assertEquals(9,calculator.square(3));  
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare2(){  
		calculator.square(-1);  
	}
	@Test  
	public void testCube(){  
		assertEquals(37,calculator.cube(3));  
	}
	@AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}
