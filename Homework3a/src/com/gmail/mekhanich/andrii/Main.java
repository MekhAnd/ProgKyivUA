package com.gmail.mekhanich.andrii;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Group one = new Group();
		
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
		Student st12 = new Student("Tasha", "Mal", "female", 18, "ZUNU");
		
		try {
		one.addStudents(st1);
		one.addStudents(st2);
		one.addStudents(st3);
		/*one.addStudents(st4);
		one.addStudents(st5);
		one.addStudents(st6);
		one.addStudents(st7);
		one.addStudents(st8);
		one.addStudents(st9);
		one.addStudents(st10);
		one.addStudents(st11);
		one.addStudents(st12);*/
			} catch (ThisProgException e) {
			System.out.println(e);
		}
		
		
		one.srchStudents("Mal");
		
		
		one.delStudents("Mal");
		
		
		
		System.out.println(one.toString());
	}
	
	
}
