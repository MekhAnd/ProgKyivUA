package com.gmail.mekhanich.andrii;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

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
				} 
			}			
		}
		
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
		if (srch.getLastName()==null) {
			System.out.println("Are you looking for "+ lastName + "? There is no any students with this last name - " + lastName + "!");
		} else {
			System.out.println(srch);
		}
		return srch;

	}

	public Student[] sorter() {
		Arrays.sort(students, Comparator.nullsLast(new StudentLastNameComaprator()));
		return students;
	}
	
	public void writerCSV (Group student, File file) throws IOException {
		String add = "";
		for (int i = 0; i < students.length; i++) {
			if (students[i]!=null) {
				add += students[i].toCSVString() + System.lineSeparator();
			}
		}
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(add);
			System.out.println("Have done!");
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
		
	
	public Group groupFromCSV (File file) throws IOException, ThisProgException {			
		String text ="";
		Group tempGr = new Group();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			for (;(text = br.readLine())!=null;) {
				String result = "";
				result += text;
				Student temp =new Student(null, null, null, 0, null); 
				temp.fromCSVString(result);
				tempGr.addStudents(temp);
				//throw new ThisProgException();
				}
			} catch (IOException e) {
					e.printStackTrace();
			} 
		return tempGr;
			
	}
	
	
	
}
