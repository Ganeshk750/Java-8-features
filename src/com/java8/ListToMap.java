package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(102, "Ganesh", 445));
		students.add(new Student(103, "Manish", 410));
		students.add(new Student(104,"Aditya", 400));
		students.add(new Student(105,"Shashi",411));
		
		Map<Integer, Student> studentMap = students.stream()
				.collect(Collectors.toMap(Student::getId, student ->student));
		System.out.println(studentMap);
	}

}


class Student{
	
	int id;
	String name;
	double marks;
	
	
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

    
	
	
	
}
