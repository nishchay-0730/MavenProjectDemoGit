package com.lti.demos;

public class TestCalc {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		String msg = c.sayHello();
		System.out.println(msg);
		
		int sum = c.addNos(52, 8);
		System.out.println(sum);
		
	}

}
