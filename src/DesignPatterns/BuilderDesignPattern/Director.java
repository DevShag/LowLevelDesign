package DesignPatterns.BuilderDesignPattern;

public class Director {

	StudentBuilder studentBuilder;
	
	Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }
	
	public Student createStudent() {
		
		if(studentBuilder instanceof EngineeringStudentBuilder) {
			return createEngineeringStudent();
		}
		else if(studentBuilder instanceof MBAStudentBuilder) {
			return createMBAStudent();
		}
		return null;
	}
	
	private Student createEngineeringStudent() {
		return studentBuilder.setRollNumber(1).setAge(22).setName("ABC").setSubject().build();
	}
	
	private Student createMBAStudent() {
		return studentBuilder.setRollNumber(1).setAge(22).setName("ABC").setFatherName("YY").setMotherName("XX").setSubject().build();
	}

}
