package com.lab1.calculator;

public class Calculator {
	
	public Calculator(){}
	
	public int add(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public int subtract(int arg1, int arg2) {
		return arg1-arg2;
	}
	
	public int multiply(int arg1, int arg2) {
		return arg1*arg2;
	}
	
	public int divide(int arg1, int arg2) {
		return arg1/arg2;
	}
	
	public boolean isEqual(int arg1, int arg2) {
		return arg1 == arg2;
	}

}
