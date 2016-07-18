package com.softpath.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.softpath.beans.CollectionPoints;
import com.softpath.beans.Triangulo;

public class CoreMain {
	
	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));//esto ya esta obsoleto
		//ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");//con este cambio el XML se tiene que mover a la altura del main
		//Triangulo triangulo = (Triangulo) factory.getBean("triangulo1");
		//triangulo.description();
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");//con este cambio el XML se tiene que mover a la altura del main
		CollectionPoints points = (CollectionPoints) factory.getBean("points_collection");
		points.drawPoint();
		
	}
}
