package DesignPatterns.BuilderDesignPattern;

import java.util.List;

public class Student {
	int rollNumber;
	int age;
	String name;
	String fatherName;
	String motherName;
	List<String> subject;
	
	public Student(StudentBuilder builder) {
		this.rollNumber=builder.rollNumber;
		this.age=builder.age;
		this.name=builder.name;
		this.fatherName=builder.fatherName;
		this.motherName=builder.motherName;
		this.subject=builder.subject;
	}
	
	
}
