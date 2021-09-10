package com.gmail.mekhanich.andrii;

public class Student extends Human  {
	
	private String univer;

	public Student(String name, String lastName, String gender, int age, String univer) {
		super(name, lastName, gender, age);
		this.univer = univer;
	}

	public Student(String name, String lastName, String gender, int age) {
		super(name, lastName, gender, age);
	}

	public String getUniver() {
		return univer;
	}

	public void setUniver(String univer) {
		this.univer = univer;
	}
	
	@Override
	public String toString() {
		return "This Human ["+ getName() +" " +getLastName() + " is the Student of [univer=" + univer + "]" + "("+getAge() + " y.o., " + getGender() + ")]";
	}
	
	
	
	

}
