package com.softpath.myxmlannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softpath.beanstwo.Student;

public class MainXML {
	public static void main(String[] args) {
		//esto es para llamar a una clase que tiene los beans en lugar de desde el xml
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloFromXMLConfig.class);
		HelloXMLFromJavaClass mybean = context.getBean(HelloXMLFromJavaClass.class);
		mybean.setMessage("Hello from annotations");//se setean los atributos
		System.out.println(mybean.getMessage());
		
		
	}
}
