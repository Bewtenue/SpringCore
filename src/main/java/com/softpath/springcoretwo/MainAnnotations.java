package com.softpath.springcoretwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softpath.beanstwo.Student;

public class MainAnnotations {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotations.xml");
		Student student = (Student) context.getBean("student");
		System.out.println("Name : " + student.getName() );
		System.out.println("Age : " + student.getAge());
	}
}
