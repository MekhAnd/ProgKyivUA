package com.gmail.mekhanich.andrii;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws ThisProgException {
		Group one = new Group();
		Group two = new Group();
		
		File group = new File ("G:\\Java_OOP_WorkSpace\\HomeWork\\ProgKyivUA\\Homework3a\\src\\com\\gmail\\mekhanich\\andrii\\group.csv");
		File groupOne = new File ("G:\\Java_OOP_WorkSpace\\HomeWork\\ProgKyivUA\\Homework3a\\src\\com\\gmail\\mekhanich\\andrii\\groupOne.csv");
		
		/*KeyboardReader kb = new KeyboardReader();
		// Initialize st0 with KeyboardReader 
		Student st0 = kb.setNewStudent();
		
		Student st1 = new Student("Ivan", "Ivanov", "male", 18, "ZUNU");
		Student st2 = new Student("Stepan", "Petrov", "male", 18, "ZUNU");
		Student st3 = new Student("Semen", "Zlobin", "male", 18, "ZUNU");
		Student st4 = new Student("Alex", "Sidorov", "male", 18, "ZUNU");
		Student st5 = new Student("Vasil", "Stepanoff", "male", 18, "ZUNU");
		Student st6 = new Student("Tatiana", "Shorr", "female", 18, "ZUNU");
		Student st7 = new Student("Svitlana", "Koff", "female", 18, "ZUNU");
		Student st8 = new Student("Katerina", "Knur", "female", 18, "ZUNU");
		Student st9 = new Student("Irina", "Tpr", "female", 18, "ZUNU");
		Student st10 = new Student("Galina", "Duck", "female", 18, "ZUNU");
		Student st11 = new Student("Nata", "Shlak", "female", 18, "ZUNU");
		Student st12 = new Student("Tasha", "Mal", "female", 18, "ZUNU");*/
		Student st12 = new Student("Tasha", "Mal", "female", 18, "ZUNU");
		Student st11 = new Student("Nata", "Shlak", "female", 18, "ZUNU");
		Student st10 = new Student("Galina", "Duck", "female", 18, "ZUNU");
		Student st9 = new Student("Irina", "Tpr", "female", 18, "ZUNU");
		Student st8 = new Student("Katerina", "Knur", "female", 18, "ZUNU");
		
		System.out.println();
		
		try {
			one.addStudents(st8);
			one.addStudents(st9);
			one.addStudents(st10);
			one.addStudents(st11);
			one.addStudents(st12);
			
		} catch (ThisProgException e) {
			System.out.println(e);
		}
		
		try {
			one.writerCSV(one, groupOne);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		/*//Search and Delete student with setSrchDelQuery
		//Search
		one.srchStudents(kb.setSrchDelQuery());
		System.out.println();
		//Delete
		one.delStudents(kb.setSrchDelQuery());
		System.out.println();
				
		System.out.println(one.toString());
		
		
		String newStud = "Igor;FTR;male;18;ZUNU";
			
		Student st13 = new Student(null, null, null, 0, null); 
		st13 = st13.fromCSVString(newStud);		
		System.out.println("s13 - " + st13);
		System.out.println(st13.toCSVString());*/
		
		
		
		try {
			two.groupFromCSV(group);
		} catch (IOException | ThisProgException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(two.toString());
		
		
		
		
		
	}
	
	
}
