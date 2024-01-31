package DesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;

public class MBAStudentBuilder extends StudentBuilder{

	@Override
	public StudentBuilder setSubject() {
		subject=new ArrayList<>();
		subject.add("Micro Economics");
		subject.add("Business Studies");
		subject.add("Operations Management");
		return this;
	}
}
