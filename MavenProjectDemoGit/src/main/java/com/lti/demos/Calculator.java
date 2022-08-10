package com.lti.demos;

public class Calculator {
	public String sayHello() {
		return "hello World";
		
	}
	public int addNos(int x,int y)
	{
		int result = x+y;
		return result;
	}
	public int subsNos(int x,int y)
	{
		int result = x-y;
		return result;
	}
	public int mulNos(int x,int y)
	{
		int result = x*y;
		return result;
	}
	public void searchEmp(int empId) {
		if (empId == 0)
		{
			throw new ArithmeticException("U Entered Zero");
		}
		else
		{
			System.out.println("Do Something");
		}
	}

}
