package com.psl.print;

public class Employee implements Printable, Katrina{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print from Employee!");
	}

	@Override
	public void acting() {
		// TODO Auto-generated method stub
		System.out.println("Acting from Employee!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Object of Employee"; 
	}

}
