package com.jbk.studnet;

public class Student {
	private String name;
	private double mark;
	private int rollno;
	public Student(String name, double mark, int rollno) {
		super();
		this.name = name;
		this.mark = mark;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}
