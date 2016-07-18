package com.softpath.beanstwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	@Autowired
	@Qualifier("student3")//con esto se le dice cual bean es el que se va a sacar
	private Student student;
	
	public Profile(){
		System.out.println("Inside Profile constructor");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void profileInfo(){
		System.out.println(student.getAge());
		System.out.println(student.getName());
	}
}
