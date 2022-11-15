package io.javabrains.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class TestRun { 
 	@Test
 	public void test() {
 		 assertEquals(-0, MyCode.multiply(0, 5) );
 	        assertEquals(+0,   MyCode.multiply(5, 0) );
 	}
 	
 	
 	@Test
 	 public void testObjects() 
 	 {    
 	     String obj1 = "Hello welcome to junit";
 	     String objcopy = obj1;
 	     String obj2 = "byee";
 	     assertNotSame(obj1,objcopy);
 	 }
 	
 	
 	@Test(timeout   = 5000)
 	public void testTimeoutOne() throws InterruptedException 
 	{ int i=500;
 		TimeUnit.SECONDS.sleep(5000);
 		while(i<=10000) 
 			 System.out.println(i++);
 	}
 	
 	
 	
 	public class TestRun1 { 
     	@Test
     	public void test() {
     		 assertEquals(-0, MyCode.multiply(0, 5) );
     	        assertEquals(+0,   MyCode.multiply(5, 0) );
     	}
     }
 	
 	
 	
 }
