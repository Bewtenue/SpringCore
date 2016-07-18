package com.softpath.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softpath.beans.PointsInjection;

public class CoreMainPointsInheritance {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("spring_inheritance.xml");
		//ApplicationContext factory = new ClassPathXmlApplicationContext("spring_inheritance.xml");
		factory.registerShutdownHook();
		PointsInjection points = (PointsInjection) factory.getBean("childpoint");
		points.DrawingDependencyInjection();
	}
}
