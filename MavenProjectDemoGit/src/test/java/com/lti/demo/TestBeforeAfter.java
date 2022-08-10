package com.lti.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {
	
	Calculator c = new Calculator();
	 int sum = 0;
	 
	 @BeforeAll
	 public static void testShowConnect()
	 {
		 System.out.println("Startup  successful");
	 }
	
	@BeforeEach
	public void testStartup()
	{
		System.out.println("Sum is zero");
	}

	@Test
	public void testsubsNos()
	{
		int subs=c.subsNos(500,250);
		Assertions.assertEquals(250, subs);
		System.out.println(subs);
	}
	@Test
	public void testaddNos()
	{
		int add=c.addNos(500,250);
		Assertions.assertEquals(750, add); 
		System.out.println(add);
	}
	@AfterEach
	public void testEndup()
	{
		System.out.println("Sum is done");
	}
	 @AfterAll
	 public static void testShutDown()
	 {
		 System.out.println("shutdown  successful");
	 }

}
