package com.sriman.exceptions;

import java.util.Scanner;

class DivisionByZeroException extends Exception{
	public DivisionByZeroException(String error){
		super(error);
	}
}
class DivisionProcessing {
	public static int divide(int a,int b) throws DivisionByZeroException{
		assert a>0 : "A cannot be negative";
		try{
			return a/b;
		}
		catch(ArithmeticException e){
			throw new DivisionByZeroException("The denominator cannot be zero");
		}
	}
}
public class DivisionExp {
	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		try {
			System.out.println(DivisionProcessing.divide(a, b));
		}
		catch(DivisionByZeroException e){
			System.err.println(e.getMessage());
		}
		System.out.println("Statement after division");
	}
}
