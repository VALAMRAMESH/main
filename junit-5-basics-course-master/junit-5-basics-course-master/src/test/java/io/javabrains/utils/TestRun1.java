package io.javabrains.utils;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRun1 {

	@BeforeClass
	public static void setUpBeforeClass()     {
		System.out.println("This is called before test start");
	}
	@AfterClass
	public   void tearDownAfterClass()  {
		System.out.println("This is called after test end");
	}
	@Test
	public void test() {
		  assertTrue(false);
	}
	
	@Test
 	public void test1() {
 		 assertEquals(-0, MyCode.multiply(0, 5) );
 	        assertEquals(+0,   MyCode.multiply(5, 0) );
 	}
	@AfterClass  
    public static void tearDownAfterClass1() throws Exception {  
        System.out.println("After class");  
    }
	
	
	public   void testArrayValues(){
	       String[] expectedvalues =   {"Renault", "Honda", "BMW"};
	       String[] givenvalues =   {"Renault", "Honda", "bmw"};
	         assertArrayEquals(expectedvalues,givenvalues);
	         }
	
}
