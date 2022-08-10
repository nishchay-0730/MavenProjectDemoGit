package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import com.lti.demos.Calculator;

import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c = new Calculator();
	@Disabled
	@Test
	public void testSayHello()
	{
		String msg = c.sayHello();
		Assertions.assertEquals("hello World", msg); 
	}
	@Test
	public void testsubsNos()
	{
		int subs=c.subsNos(500,250);
		Assertions.assertEquals(250, subs); 
	}
	@Test
	public void testaddNos()
	{
		int add=c.addNos(500,250);
		Assertions.assertEquals(750, add); 
	}
	@Test
	public void testAssertNulols()
	{
		String s1 = null;
		String s2 = "Nikhil";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10); //condition is false, so testAssertFalse is true
		Assertions.assertFalse(10>20, "10 is smaller");
		Assertions.assertNotEquals("Hello", "hello");
	}
	
	@Test
	public void testArrays() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertTrue(myList.isEmpty());
		myList.add(56);
		Assertions.assertEquals(1,myList.size());
	}

	

	
}
