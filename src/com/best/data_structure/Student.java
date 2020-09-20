package com.best.data_structure;

public class Student {

	private int rollNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	private String name;
	private String nrc;
	public Student(int rollNo, String name, String nrc) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.nrc = nrc;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name =>"+name+"; Nrc=>"+nrc;
	}
	
}
