package io.javabrains.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class TestItem {
	
	
	@Test
 	public void testDiscount()
 	{
 		Item objitem;
		objitem.setDiscountasfileds(10);
        objitem.setPrice(100);
 		assertEquals(12.5,()(objitem.getPrice()*objitem.getDiscountasfileds()));
 		assertEquals(12,objitem.getPrice()*objitem.getDiscountasfileds());

}
	
	
	@Test
    public void method() {
        assertTrue(new   ArrayList().isEmpty());
    }
	
	
	@Test(timeout   = 500)
    public void testTimeoutonMethod()   throws InterruptedException 
    {
        while (true)
        {
              Thread.currentThread().sleep(1000);
        }
        
        
        @Ignore
        @Test
        public void testAdd()
        {
         when(service.add(2,3)).thenReturn(6);
         assertEquals(10,c.add(2,3));
        }
	
	
}
}
