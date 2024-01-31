package DesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubject() {
		subject=new ArrayList<>();
		subject.add("DSA");
		subject.add("OS");
		subject.add("Computer Architecture");
		return this;
	}

	
}
