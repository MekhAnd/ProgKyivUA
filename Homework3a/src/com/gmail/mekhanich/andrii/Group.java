package com.gmail.mekhanich.andrii;

import java.util.Arrays;

public class Group {

	private Student[] students = new Student[10];

	public Group() {
		super();
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		this.sorter();
		String message = "Group [students= " + System.lineSeparator();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				message += students[i];
				message += System.lineSeparator();
			} else {
				continue;
			}
		}
		return message;
	}

	public void addStudents(Student student) throws ThisProgException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				System.out.println("New student was successfully enrolled!");
				break;
			} else if (i < students.length - 1) {
				continue;
			} else if (students[i] != null && i == students.length - 1) {
				System.out.println("Error in process!");
				throw new ThisProgException();
			}
			break;
		}

	}

	public void delStudents(String lastName) {
		for (int i = 0; i < students.length; i++) {
			if (students[i]!=null) {
				if (lastName.equals(students[i].getLastName())) {
					students[i] = null;
					System.out.println("This " + lastName + " student was successfully delete from!");
					break;
				} //else {
					//System.out.println("There is no any students with this last name -" + lastName + "!");
				//} 
			}
			
			
		}
		System.out.println("There is no any students with this last name -" + lastName + "!");
	}

	public Student srchStudents(String lastName) {
		Student srch = new Student(null, null, null, 0);
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (lastName.equals(students[i].getLastName())) {
					srch = students[i];
					System.out.println("We have some results!");
					break;
				}
			} 
		
		}
		System.out.println("There is no any students with this last name -" + lastName + "!");
		return srch;

	}

	public Student[] sorter() {

		String[] temp = new String[students.length];
		for (int i = 0; i < temp.length; i++) {
			if (students[i] != null) {
				temp[i] = students[i].getLastName();
			} else {
				temp[i] = "";
			}
		}
		Arrays.sort(temp);
		for (int j = 0; j < temp.length; j++)
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && temp[j] == students[i].getLastName()) {
					Student t = new Student(null, null, null, i, null);
					t = students[j];
					students[j] = students[i];
					students[i] = t;
				}
			}

		return students;
	}
}
