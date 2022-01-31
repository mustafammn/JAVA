package com.syntax.class16;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student=new Student();
		student.name="Sebastian";
		student.id="123";
		Student.numnberOfStudents++;
		
		Student student1=new Student();
		student1.name="Hormat";
		student1.id="1234";
		Student.numnberOfStudents++;
		
		Student student2=new Student();
		student2.name="Zema";
		student2.id="12345";
		Student.numnberOfStudents++;
		
		System.out.println(Student.numnberOfStudents);
	}

}
