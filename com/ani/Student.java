package com.ani;

public class Student {
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
	}

	int roll;
	String name;
	double mark;
	
	public Student(int roll,String name,double mark) {
		this.roll=roll;
		this.name=name;
		this.mark=mark;
	}

}
